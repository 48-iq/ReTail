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
})

const bottomDivRef = useTemplateRef('bottom-div')
const isBottomDivVisible = useElementVisibility(bottomDivRef, )



watch(isBottomDivVisible, () => {

  if (isBottomDivVisible.value && 
  announcementCardsWidgetStore.last + 1 < announcementCardsWidgetStore.total && 
  !announcementCardsWidgetStore.isLoading
) {
    announcementCardsWidgetStore.fetchCards(
      {query, category, subcategory, page:announcementCardsWidgetStore.last+1, size:10}
    )
  }
})
</script>

<template>
  <AdvertisementCardList :advertisement-cards="announcementCardsWidgetStore.advertisementCards"/>
  <div ref="bottom-div" id="bottom-div"/>
</template>

<style scoped>

</style>
