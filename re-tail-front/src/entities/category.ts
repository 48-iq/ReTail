import axios from "axios"
import { host } from "./host"

export type Category = {
  id: string
  name: string
  subcategories: Subcategory[]
}

export type CategoryInfo = {
  id: string
  name: string
}

export type Subcategory = {
  id: string
  name: string
}
export const categoryActions = {
  fetchCategories: async () => {
    return axios.get<Category[]>(`${host}/category/all`)
    .then(res => res)
  }
}


