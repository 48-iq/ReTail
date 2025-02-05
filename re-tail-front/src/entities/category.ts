import axios from "axios"
import { host } from "./host"

export type CategoryType = {
  id: string
  name: string
  subcategories: SubcategoryType[]
}

export type CategoryInfoType = {
  id: string
  name: string
}

export type SubcategoryType = {
  id: string
  name: string
}
export const categoryActions = {
  fetchCategories: async () => {
    return axios.get<CategoryType[]>(`${host}/category/all`)
    .then(res => res)
  }
}


