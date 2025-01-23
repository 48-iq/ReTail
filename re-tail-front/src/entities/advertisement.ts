import axios from "axios"
import type { CategoryInfoType, SubcategoryType } from "./category"
import type { UserInfoType } from "./user"
import { host } from "./host"

export type AdvertisementFormType = {
  title: string
  description: string
  images: File[]
  price: number
  contacts: string
  address: string
  characteristics: CharacteristicType[]
  category: string
  subcategory: string

}

export type AdvertisementType = {
  id: string
  title: string
  description: string
  images: string[]
  price: number
  contacts: string
  createdAt: string
  address: string
  characteristics: CharacteristicType[]
  creator: UserInfoType
  category:  CategoryInfoType
  subcategory: SubcategoryType
  sameAdvertisement: AdvertisementCardType[]
}

export type AdvertisementCardType = {
  id: string
  title: string
  price: number
  image: string
  creator: UserInfoType
}

export type AdvertisementCardsPageType = {
  total: number
  page: number
  size: number
  advertisementCards: AdvertisementCardType[]
}

export type CharacteristicType = {
  name: string
  value: string
}

export const advertisementActions = {
  fetchCards: async (
    query: string|null,
    category: string|null,
    subcategory: string|null,
    page: number,
    size: number) => axios.get<AdvertisementCardsPageType>(`${host}/advertisement-cards`,
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
  .then(res => res),

  fetchAdvertisement: async (
    id: string) => axios.get<AdvertisementType>(`${host}/advertisement/${id}`)
  .then(res => res),


}
