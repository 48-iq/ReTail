<script setup lang="ts">
import { useCategoriesPanelStore } from '@/stores/categoriesPanelStore';
import AppHeader from '@/widgets/AppHeader.vue';
import CategoriesPanel from '@/widgets/CategoriesPanel.vue';

//state initialization
const categoriesPanelState = useCategoriesPanelStore()

</script>

<template>
  <div>
    <AppHeader/>
    <CategoriesPanel v-if="categoriesPanelState.isPanelActive"/>
  </div>
</template>
