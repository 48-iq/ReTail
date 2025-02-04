import type { ContactType } from "./announcement"

export type UserInfoType = {
  id: string
  nickname: string
  avatar: string
  rating: number
}

export type UserType = {
  id: string
  nickname: string
  name: string
  surname: string
  address: string
  contacts: ContactType[]
  registeredAt: string
  aboutMe: string
  avatar: string
  rating: number
  announcementCount: number
}
