import type { Category, Subcategory } from "@/entities/category";
import { defineStore } from "pinia";
import { ref } from "vue";
import { categoryActions } from "@/entities/category";

export const useCategoriesPanelStore = defineStore('categoriesPanel', () => {

  const isPanelActive = ref(false)
  const categories = ref<Category[]>([])

  const selectedCategory = ref<Category | null>(null)
  const selectedSubcategory = ref<Subcategory | null>(null)

  const pointedCategory = ref<Category | null> (null)

  const panelSize = ref<number>(1)

  const fetchCategories = async () => {
    categoryActions.fetchCategories()
      .then(res => {
        categories.value = res.data

        // calculate panel size (max count of categories or subcategories)
        panelSize.value = categories.value.length + 1
        categories.value.forEach(category => {
          if (category.subcategories.length > panelSize.value)
            panelSize.value = category.subcategories.length
        })
      })
  }

  const getSelectedCategoriesNames = () => {
    if (selectedCategory.value === null)
      return ''
    else {
      if (selectedSubcategory.value === null)
        return selectedCategory.value.name
      else
        return selectedCategory.value.name + '>' + selectedSubcategory.value.name
    }
  }

  const pointAllCategories = () => {
    pointedCategory.value = null
  }

  const pointCategory = (id: string) => {
    pointedCategory.value = categories.value.filter(category => category.id === id)[0]
  }

  const selectAllCategories = () => {
    selectedCategory.value = null
    selectedSubcategory.value = null
  }

  const selectCategory = (id: string) => {
    selectedCategory.value = categories.value.filter(category => category.id === id)[0]
    selectedSubcategory.value = null
  }

  const selectSubcategory = (categoryId: string, subcategoryId: string) => {
    selectedCategory.value = categories.value.filter(category => category.id === categoryId)[0]
    if (selectedCategory.value)
      selectedSubcategory.value = selectedCategory.value.subcategories.filter(subcategory => subcategory.id === subcategoryId)[0]
  }

  const togglePanel = () => {
    isPanelActive.value = !isPanelActive.value
  }

  const getPanelSize = () => {
    return panelSize.value
  }

  return {isPanelActive, togglePanel, getPanelSize,
    fetchCategories, categories,
    selectCategory, selectSubcategory, selectAllCategories,
    selectedCategory, selectedSubcategory,
    pointCategory, pointAllCategories, pointedCategory,
    getSelectedCategoriesNames
  }
})
