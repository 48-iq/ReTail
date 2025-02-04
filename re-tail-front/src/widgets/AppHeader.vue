<script setup lang="ts">
import BaseButton from '@/shared/ui/buttons/BaseButton.vue';
import FavouritesButton from '@/shared/ui/buttons/FavouritesButton.vue';
import ProfileButton from '@/shared/ui/buttons/ProfileButton.vue';
import WhiteButton from '@/shared/ui/buttons/WhiteButton.vue';
import TopLine from '@/shared/ui/other/TopLine.vue';
import BaseSearchBar from '@/shared/ui/search-bars/BaseSearchBar.vue';
import { useCategoriesPanelStore } from '@/stores/categoriesPanelStore';
import { useSearchStore } from '@/stores/searchStore';
import { useRouter } from 'vue-router';

//state initialization
const router = useRouter()

const categoriesPanelState = useCategoriesPanelStore()

const searchStore = useSearchStore()


//navigation buttons functions
const routeToProfile = () => {
  router.push('/profile')
}

const routeToFavourites = () => {
  router.push('/favourites')
}


const search = () => {
  let paramsStr = ''
  let paramsCount = 0
  if (searchStore.searchBar) paramsCount++;
  if (categoriesPanelState.selectedCategory) paramsCount++;
  if (categoriesPanelState.selectedSubcategory) paramsCount++;
  if (paramsCount > 0) {
    paramsStr += '?'
    if (searchStore.searchBar) {
      paramsStr += 'query=' + searchStore.searchBar
      paramsCount--;
    }
    if (paramsCount>0) paramsStr += '&'
    if (categoriesPanelState.selectedCategory) {
      paramsStr += 'category=' + categoriesPanelState.selectedCategory
      paramsCount--;
    }
    if (paramsCount>0) paramsStr += '&'
    if (categoriesPanelState.selectedSubcategory) {
      paramsStr += 'subcategory=' + categoriesPanelState.selectedSubcategory
    }

  }
  router.push('/home' + paramsStr)
}

</script>

<template>
  <header>
   <TopLine/>
    <div class="container">
      <WhiteButton @click="categoriesPanelState.togglePanel">Категории</WhiteButton>
      <BaseSearchBar v-model="searchStore.searchBar"/>
      <BaseButton @click="search" style="height: 50px;">Найти</BaseButton>
      <FavouritesButton @click="routeToFavourites"/>
      <ProfileButton @click="routeToProfile"/>
    </div>
    <span class="selected-categories">{{ categoriesPanelState.getSelectedCategoriesNames() }}</span>
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
  font-size: 14px;
  line-height: 20px;
}
</style>
