import axios from "axios"
import type { CategoryInfoType, SubcategoryType } from "./category"
import type { UserInfoType } from "./user"
import { host } from "./host"


//TODO сделать типы для формы контакта и формы характеристики 
export type AnnouncementFormType = {
  title: string
  description: string
  images: File[]
  price: number
  contacts: ContactType[]
  address: string
  characteristics: CharacteristicType[]
  category: string
  subcategory: string
}

export type AnnouncementType = {
  id: string
  title: string
  description: string
  category:  CategoryInfoType
  subcategory: SubcategoryType
  images: string[]
  price: number
  address: string
  creator: UserInfoType
  createdAt: string
  contacts: ContactType[]
  inFavorites: boolean
  characteristics: CharacteristicType[]
  sameAnnouncements: AnnouncementCardType[]
}

export type ContactType = {
  id: string
  contact: string
}

export type AnnouncementCardType = {
  id: string
  title: string
  price: number
  inFavourites: boolean
  image: string
  creator: UserInfoType
}

export type AdvertisementCardsPageType = {
  total: number
  page: number
  size: number
  data: AnnouncementCardType[]
}

export type CharacteristicType = {
  id: string
  name: string
  value: string
}

export const advertisementActions = {
  fetchAnnouncementCards: async (
    params: {
      query: string|null,
      page: number,
      size:number,
      category: string|null,
      subcategory: string|null
    }) => axios.get<AdvertisementCardsPageType>(`${host}/announcement/find`,{params: {...params}})
  .then(res => res),

  fetchAnnouncement: async (
    id: string) => axios.get<AnnouncementType>(`${host}/announcement/${id}`)
  .then(res => res),


}
