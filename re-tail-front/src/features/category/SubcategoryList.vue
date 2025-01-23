<script setup lang="ts">
import { useCategoriesPanelStore } from '@/stores/categoriesPanelStore';
import SubcategoryButton from '../../shared/ui/buttons/SubcategoryButton.vue';

const categoriesPanelState = useCategoriesPanelStore()


</script>

<template>
  <div class="category-list" :style="{height: categoriesPanelState.getPanelSize() * 40 + 20 + 'px'}">
    <SubcategoryButton v-for="subcategory in categoriesPanelState.pointedCategory?.subcategories"
    :key="subcategory.id"
    @click="() => {
      if (categoriesPanelState.pointedCategory !== null)
        categoriesPanelState.selectSubcategory(categoriesPanelState.pointedCategory.id, subcategory.id)
    }">
      {{ subcategory.name }}
    </SubcategoryButton>

  </div>
</template>
<style lang="css" scoped>
.category-list {
  border: solid 1px var(--color-black);
  border-left: none;
  width: 257px;
  padding: 15px;
  display: flex;
  flex-direction: column;
  align-items: center;
  gap: 10px;
  }
</style>
