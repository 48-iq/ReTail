<script setup lang="ts">
import { categoryActions, type CategoryType, type SubcategoryType } from '@/entities/category';
import BaseButton from '@/shared/ui/buttons/BaseButton.vue';
import FavouritesButton from '@/shared/ui/buttons/FavouritesButton.vue';
import ProfileButton from '@/shared/ui/buttons/ProfileButton.vue';
import WhiteButton from '@/shared/ui/buttons/WhiteButton.vue';
import TopLine from '@/shared/ui/other/TopLine.vue';
import BaseSearchBar from '@/shared/ui/search-bars/BaseSearchBar.vue';
import CategoriesPanel from '../shared/ui/other/CategoriesPanel.vue';
import { onMounted, ref} from 'vue';
import { useRouter } from 'vue-router';

const router = useRouter()

const searchBar = ref('')

const isPanelActive = ref(false)
const categories = ref<CategoryType[]>([])
const selectedCategory = ref<CategoryType | null>(null)
const selectedSubcategory = ref<SubcategoryType | null>(null)

const routeToProfile = () => {
  router.push('/profile')
}

const routeToFavourites = () => {
  router.push('/favourites')
}

const search = () => {
  let paramsStr = ''
  let paramsCount = 0
  if (searchBar.value) paramsCount++;
  if (selectedCategory.value) paramsCount++;
  if (selectedSubcategory.value) paramsCount++;
  if (paramsCount > 0) {
    paramsStr += '?'
    if (searchBar.value) {
      paramsStr += 'query=' + searchBar.value
      paramsCount--;
    }
    if (paramsCount>0) paramsStr += '&'
    if (selectedCategory.value) {
      paramsStr += 'category=' + selectedCategory.value.id
      paramsCount--;
    }
    if (paramsCount>0) paramsStr += '&'
    if (selectedSubcategory.value) {
      paramsStr += 'subcategory=' + selectedSubcategory.value.id
    }

  }
  router.push('/home' + paramsStr)
  .then(() => router.go(0))
}

const fetchCategories = async () => {
  categoryActions.fetchCategories()
    .then(res => {
      categories.value = res.data
    })
}

const getPathStr = () => {
  let pathStr = ''
  if (selectedCategory.value) pathStr += selectedCategory.value.name
  if (selectedSubcategory.value) pathStr += ' > ' + selectedSubcategory.value.name
  if (searchBar.value) pathStr += ' > ' + searchBar.value
  return pathStr
}

const selectAllCategories = () => {
  selectedCategory.value = null
  selectedSubcategory.value = null
}

const selectCategory = (id: string) => {
  selectedCategory.value = categories.value.filter(category => category.id === id)[0]
  selectedSubcategory.value = null

}

const selectSubcategory = (categoryId: string, subcategoryId: string) => {
  console.log('select sub category')
  selectedCategory.value = categories.value.filter(category => category.id === categoryId)[0]
  if (selectedCategory.value)
    selectedSubcategory.value = selectedCategory.value.subcategories.filter(subcategory => subcategory.id === subcategoryId)[0]

}

const togglePanel = () => {
  isPanelActive.value = !isPanelActive.value
}

onMounted(() => {
  fetchCategories()
})




</script>

<template>
  <header>
   <TopLine/>
    <div class="container">
      <WhiteButton @click="togglePanel">Категории</WhiteButton>
      <BaseSearchBar v-model="searchBar"/>
      <BaseButton @click="search" style="height: 50px;">Найти</BaseButton>
      <FavouritesButton @click="routeToFavourites"/>
      <ProfileButton @click="routeToProfile"/>
    </div>
    <span class="selected-categories">{{ getPathStr() }}</span>
    <CategoriesPanel
    v-if="isPanelActive"
    :categories="categories"
    :selected-category="selectedCategory"
    :selected-subcategory="selectedSubcategory"
    :select-all-categories="selectAllCategories"
    :select-category="selectCategory"
    :select-subcategory="selectSubcategory"/>
  </header>
</template>

<style scoped>
.container {
  display: grid;
  grid-template-columns: 240px 560px 250px  100px 50px;
  align-items: center;
  margin-top: 15px;
}
.selected-categories {
  padding-left: 240px;
  color: var(--color-blue-green);
  font-size: 16px;
  line-height: 20px;
}
</style>
