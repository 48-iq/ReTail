<script setup lang="ts">
import AdvertisementCardList from '@/features/advertisement/AdvertisementList.vue';
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
    <AdvertisementCardList/>
  </div>
</template>
