<script setup lang="ts">
import AnnouncementCardsWidget from '@/widgets/AnnouncementCardsWidget.vue';
import { useCategoriesPanelStore } from '@/stores/categoriesPanelStore';
import AppHeader from '@/widgets/AppHeader.vue';
import CategoriesPanel from '@/widgets/CategoriesPanel.vue';
import { useRoute } from 'vue-router';
import { onMounted } from 'vue';

//state initialization
const categoriesPanelState = useCategoriesPanelStore()

const route = useRoute()

const urlParams = new URLSearchParams(route.fullPath.substring(route.fullPath.indexOf('?')))

const query = urlParams.get('query')
const category = urlParams.get('category')
const subcategory = urlParams.get('subcategory')

onMounted(() => {
  categoriesPanelState.fetchCategories({searchCategory: category, searchSubcategory: subcategory})
})

</script>

<template>
  <div>
    <AppHeader/>
    <CategoriesPanel v-if="categoriesPanelState.isPanelActive"/>
    <AnnouncementCardsWidget :query 
    :category 
    :subcategory/>
  </div>
</template>
