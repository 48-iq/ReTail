<script setup lang="ts">
import AdvertisementCardList from '@/features/advertisement/AnnouncementCardList.vue';
import { useAnnouncementCardsWidgetStore } from '@/stores/announcementCardsWidgetStore';
import { useElementVisibility } from '@vueuse/core';
import { onMounted, useTemplateRef, watch } from 'vue';

const announcementCardsWidgetStore = useAnnouncementCardsWidgetStore()

const {query, category, subcategory} = 
  defineProps<{query: string|null, category: string|null, subcategory: string|null}>()

onMounted(() => {
  announcementCardsWidgetStore.clear()
  announcementCardsWidgetStore.initialFetch({query, category, subcategory, page:0, size:10})
})

const bottomDivRef = useTemplateRef('bottom-div')
const isBottomDivVisible = useElementVisibility(bottomDivRef, )



watch(isBottomDivVisible, () => {
  console.log(isBottomDivVisible.value)
  if (isBottomDivVisible.value && 
  announcementCardsWidgetStore.lastPage < announcementCardsWidgetStore.total && 
  !announcementCardsWidgetStore.isLoading
) {
    announcementCardsWidgetStore.fetchLast({query, category, subcategory, page:announcementCardsWidgetStore.lastPage+1, size:10})
  }
})
</script>

<template>
  <AdvertisementCardList :advertisement-cards="announcementCardsWidgetStore.advertisementCards"/>
  <div v-if="announcementCardsWidgetStore.advertisementCards.length" ref="bottom-div" id="bottom-div"/>
</template>

<style scoped>

</style>
