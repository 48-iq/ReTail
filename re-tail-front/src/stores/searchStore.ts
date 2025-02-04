import { defineStore } from "pinia";
import { ref } from "vue";

export const useSearchStore = defineStore('search', () => {
  const searchBar = ref('')

  const setSearchBar = (value: string) => searchBar.value = value

  return { searchBar, setSearchBar }
})