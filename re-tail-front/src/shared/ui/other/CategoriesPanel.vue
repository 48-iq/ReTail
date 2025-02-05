<script setup lang="ts">
import type { CategoryType, SubcategoryType } from '@/entities/category';
import CategoryList from '@/features/category/CategoryList.vue';
import SubcategoryList from '@/features/category/SubcategoryList.vue';
import { ref } from 'vue';

const {
  categories, 
  selectAllCategories,
  selectCategory,
  selectSubcategory
} = defineProps<{
  categories: CategoryType[],
  selectedCategory: CategoryType | null,
  selectedSubcategory: SubcategoryType | null,
  selectAllCategories: () => void,
  selectCategory: (id: string) => void,
  selectSubcategory: (categoryId: string, subcategoryId: string) => void
}>()


const pointedCategory = ref<CategoryType | null> (null)


const pointAllCategories = () => {
  pointedCategory.value = null
}

const pointCategory = (id: string) => {
  pointedCategory.value = categories.filter(category => category.id === id)[0]
}

const panelSize = () => {
  let size = categories.length + 1
  categories.forEach(category => {
    size = Math.max(size, category.subcategories.length)
  })
  return size;
}


</script>

<template>
  <div class="categories-panel" @mouseleave ="pointAllCategories">
    <CategoryList 
    :categories
    :panel-size="() => panelSize()"
    :point-all-categories="pointAllCategories"
    :point-category="pointCategory"
    :select-all-categories="selectAllCategories"
    :select-category="selectCategory"/>
    <SubcategoryList v-if="pointedCategory" 
    :pointed-category="pointedCategory"
    :panel-size="() => panelSize()"
    :select-subcategory="selectSubcategory"/>
  </div>
</template>

<style scoped>
.categories-panel {
  width: fit-content;
  position: absolute;
  display: flex;
  top: 165px;
  left: 0;
}
</style>
