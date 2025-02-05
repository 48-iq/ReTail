import { defineStore } from "pinia"
import { ref } from "vue"

export const useSearchUrlParamsStore = defineStore('urlParams', () => {
  const query = ref<string|null>(null)
  const category =  ref<string|null>(null)
  const subcategory =  ref<string|null>(null)

  const searchParams = (page: number, size: number) => {
    return { 
      query: query.value, 
      page, 
      size, 
      category: category.value, 
      subcategory: subcategory.value 
    }
  }

  const searchCategories = () => {
    console.log('search categories')
    console.log(category.value, subcategory.value)
    return { 
      searchCategory: category.value, 
      searchSubcategory: subcategory.value 
    }
  }

  const setUrlParams = (args: {query: string|null, category: string|null, subcategory: string|null}) => {
    console.log('set url params')
    query.value = args.query
    category.value = args.category
    subcategory.value = args.subcategory
    console.log(query.value, category.value, subcategory.value)
  }

  return { query, category, subcategory, searchParams, searchCategories, setUrlParams }
})