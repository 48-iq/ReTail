import axios from "axios"
import type { CategoryInfo, Subcategory } from "./category"
import type { UserInfo } from "./user"
import { host } from "./host"

export type Advertisement = {
  id: string
  title: string
  description: string
  images: string[]
  price: number
  contacts: string
  createdAt: string
  address: string
  characteristics: Characteristic[]
  creator: UserInfo
  category:  CategoryInfo
  subcategory: Subcategory
  sameAdvertisement: AdvertisementCard[]
}

export type AdvertisementCard = {
  id: string
  title: string
  price: number
  creator: UserInfo
}

export type AdvertisementCardsPage = {
  total: number
  page: number
  size: number
  advertisementCards: AdvertisementCard[]
}

export type Characteristic = {
  name: string
  value: string
}

export const advertisementActions = {
  fetchCards: async (
    query: string|null,
    category: string|null,
    subcategory: string|null,
    page: number,
    size: number) => axios.get<AdvertisementCardsPage>(`${host}/advertisement`,
    {
      params: {
        query: query? query: undefined,
        category: category? category: undefined,
        subcategory: subcategory? subcategory: undefined,
        page,
        size
      }
    }
  )
  .then(res => res)
}
