import { advertisementActions, type AnnouncementCardType } from "@/entities/announcement";
import { defineStore } from "pinia";
import { ref } from "vue";

export const useAnnouncementCardsWidgetStore = defineStore('advertisementCardList', () => {
  const advertisementCards = ref<AnnouncementCardType[]>([])
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

  const clear = () => {
    advertisementCards.value = []
    last.value = -1
    total.value = 1
    isError.value = false
  }

  return { advertisementCards, fetchCards, last, total, clear, isLoading, isError }
})
