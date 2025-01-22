<script setup lang="ts">
import { useCategoriesPanelStore } from '@/stores/categoriesPanelStore';
import AllCategoriesButton from './AllCategoriesButton.vue';
import CategoryButton from './CategoryButton.vue';

const categoriesPanelState = useCategoriesPanelStore()


</script>

<template>
  <div class="category-list" :style="{height: categoriesPanelState.getPanelSize() * 40 + 20 + 'px'}">

    <AllCategoriesButton @mouseover="() => categoriesPanelState.pointAllCategories()"
    @click="() => categoriesPanelState.selectAllCategories()"/>

    <CategoryButton v-for="category in categoriesPanelState.categories"
    :key="category.id"
    @mouseover="() => categoriesPanelState.pointCategory(category.id)"
    @click="() => categoriesPanelState.selectCategory(category.id)">
      {{ category.name }}
    </CategoryButton>

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
