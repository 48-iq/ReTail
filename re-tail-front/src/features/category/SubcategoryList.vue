<script setup lang="ts">
import SubcategoryButton from '../../shared/ui/buttons/SubcategoryButton.vue';
import type { CategoryType } from '@/entities/category';


const {
  panelSize,
  pointedCategory,
  selectSubcategory
} = defineProps<{
  panelSize: () => number,
  pointedCategory: CategoryType | null,
  selectSubcategory: (categoryId: string, subcategoryId: string) => void
}>()
</script>

<template>
  <div class="category-list" :style="{height: panelSize() * 40 + 20 + 'px'}">
    <SubcategoryButton v-for="subcategory in pointedCategory?.subcategories || []"
    :key="subcategory.id"
    @click="() => {if (pointedCategory)selectSubcategory(pointedCategory.id, subcategory.id)}">
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
