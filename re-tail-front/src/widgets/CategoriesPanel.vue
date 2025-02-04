<script setup lang="ts">
import CategoryList from '@/features/category/CategoryList.vue';
import SubcategoryList from '@/features/category/SubcategoryList.vue';
import { useCategoriesPanelStore } from '@/stores/categoriesPanelStore';

const categoriesPanelState = useCategoriesPanelStore()


</script>

<template>
  <div class="categories-panel" @mouseleave ="() => categoriesPanelState.pointAllCategories()">
    <CategoryList/>
    <SubcategoryList v-if="categoriesPanelState.pointedCategory !== null" />
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
