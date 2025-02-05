<script setup lang="ts">
import { useSearchUrlParamsStore } from '@/stores/searchUrlParamsStore'
import { onMounted } from 'vue'
import { RouterView, useRoute } from 'vue-router'
const route = useRoute()


const urlParamsStore = useSearchUrlParamsStore()

onMounted(() => {
  console.log('mounted')
  console.log(route.fullPath)
  console.log(route.fullPath.substring(route.fullPath.indexOf('?')))
  const urlParams = new URLSearchParams(route.fullPath.substring(route.fullPath.indexOf('?')))

  const query = urlParams.get('query')
  const category = urlParams.get('category')
  const subcategory = urlParams.get('subcategory')
  urlParamsStore.setUrlParams({query, category, subcategory})
})

</script>

<template>
  

  <RouterView />
</template>

<style scoped>

</style>
