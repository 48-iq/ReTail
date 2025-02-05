<script setup lang="ts">
import AllCategoriesButton from '../../shared/ui/buttons/AllCategoriesButton.vue';
import CategoryButton from '../../shared/ui/buttons/CategoryButton.vue';
import type { CategoryType } from '@/entities/category';



const {
  categories,
  panelSize,
  selectAllCategories,
  selectCategory,
  pointCategory,
  pointAllCategories
} = defineProps<{
  categories: CategoryType[],
  panelSize: () => number,
  selectAllCategories: () => void,
  selectCategory: (id: string) => void,
  pointCategory: (id: string) => void,
  pointAllCategories: () => void
}>()



</script>

<template>
  <div class="category-list" :style="{height: panelSize() * 40 + 20 + 'px'}">

    <AllCategoriesButton @mouseover="pointAllCategories"
    @click="selectAllCategories"/>

    <CategoryButton v-for="category in categories"
    :key="category.id"
    @mouseover="() => pointCategory(category.id)"
    @click="() => selectCategory(category.id)">{{ category.name }}</CategoryButton>
  </div>
</template>
<style lang="css" scoped>
.category-list {
  border: solid 1px var(--color-black);
  width: 257px;
  padding: 15px;
  display: flex;
  flex-direction: column;
  align-items: center;
  gap: 10px;
  }
</style>
