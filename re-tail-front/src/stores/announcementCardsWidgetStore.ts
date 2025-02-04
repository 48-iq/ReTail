import { advertisementActions, type AnnouncementCardType } from "@/entities/announcement";
import { defineStore } from "pinia";
import { ref } from "vue";

export const useAnnouncementCardsWidgetStore = defineStore('advertisementCardList', () => {
  const advertisementCards = ref<AnnouncementCardType[]>([])
  const lastPage = ref(-1)
  const total = ref(0)
  const isError = ref(false)
  const isLoading = ref(false)

  const initialFetch = async (
    params: {
      query: string|null,
      page: number,
      size:number,
      category: string|null,
      subcategory: string|null
    }
  ) => {
    console.log('initial fetch')
    isLoading.value = true
    isError.value = false
    advertisementActions.fetchAnnouncementCards(params)
    .then(res => {
      advertisementCards.value = res.data.data
      lastPage.value = res.data.page
      total.value = res.data.total
      isLoading.value = false;
    })
    .catch( () => {
      isError.value = true
      isLoading.value = false
    })
  }


  const fetchLast = async (
    params: {
      query: string|null,
      page: number,
      size:number,
      category: string|null,
      subcategory: string|null
    }
  ) => {
    console.log('fetch last')
    isError.value = false
    isLoading.value = true
    advertisementActions.fetchAnnouncementCards(params)
    .then(res => {
      advertisementCards.value.push(...res.data.data)
      lastPage.value = res.data.page
      total.value = res.data.total
      isLoading.value = false
    })
    .catch( () => {
      isError.value = true
      isLoading.value = false
    })

  }

  const clear = () => {
    console.log('clear')
    advertisementCards.value = []
    lastPage.value = -1
    total.value = 0
    isError.value = false
  }

  return { advertisementCards, fetchLast, lastPage, total, clear, initialFetch, isLoading, isError }
})
