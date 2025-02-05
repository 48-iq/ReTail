<script setup lang="ts">
import { advertisementActions, type AnnouncementCardType } from '@/entities/announcement';
import AdvertisementCardList from '@/features/advertisement/AnnouncementCardList.vue';
import { useElementVisibility } from '@vueuse/core';
import {ref, useTemplateRef, watch } from 'vue';


const bottomDivRef = useTemplateRef('bottom-div')
const isBottomDivVisible = useElementVisibility(bottomDivRef, )

const advertisementCards = ref<AnnouncementCardType[]>([])

const {query, category, subcategory} = defineProps<{
  query: string|null,
  category: string|null,
  subcategory: string|null
}>()


const last = ref(-1)
const total = ref(1)
const isError = ref(false)
const isLoading = ref(false)


const fetchCards = async (
  params: {
    query: string|null,
    page: number,
    size:number,
    category: string|null,
    subcategory: string|null
  }
) => {
  isError.value = false
  isLoading.value = true
  advertisementActions.fetchAnnouncementCards(params)
  .then(res => {
    advertisementCards.value.push(...res.data.data)
    last.value = res.data.page
    total.value = res.data.total
    isLoading.value = false
  })
  .catch( () => {
    isError.value = true
    isLoading.value = false
  })

}

watch(isBottomDivVisible, () => {

  if (isBottomDivVisible.value && 
  last.value + 1 < total.value && 
  !isLoading.value) 
    fetchCards({
      query,
      category,
      subcategory,
      page: last.value + 1,
      size: 10,
    })
})
</script>

<template>
  <AdvertisementCardList :advertisement-cards="advertisementCards"/>
  <div ref="bottom-div" id="bottom-div"/>
</template>

<style scoped>

</style>
