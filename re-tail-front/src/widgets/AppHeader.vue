<script setup lang="ts">
import FavouritesButton from '@/shared/ui/buttons/FavouritesButton.vue';
import ProfileButton from '@/shared/ui/buttons/ProfileButton.vue';
import WhiteButton from '@/shared/ui/buttons/WhiteButton.vue';
import BaseSearchBar from '@/shared/ui/search-bars/BaseSearchBar.vue';
import { useCategoriesPanelStore } from '@/stores/categoriesPanelStore';
import { ref, } from 'vue';
import { useRouter } from 'vue-router';

//state initialization
const router = useRouter()

const searchBarModel = ref('')

const categoriesPanelState = useCategoriesPanelStore()


//navigation buttons functions
const routeToProfile = () => {
  router.push('/profile')
}

const routeToFavourites = () => {
  router.push('/favourites')
}

</script>

<template>
  <header>
    <div class="top-line"/>
    <div class="container">
      <WhiteButton @click="categoriesPanelState.togglePanel">Категории</WhiteButton>
      <BaseSearchBar v-model="searchBarModel"/>
      <FavouritesButton @click="routeToFavourites"/>
      <ProfileButton @click="routeToProfile"/>
    </div>
    <span class="selected-categories">{{ categoriesPanelState.getSelectedCategoriesNames() }}</span>
  </header>
</template>

<style scoped>
.top-line {
  width: 100%;
  height: 50px;
  background-color: var(--color-dark-green);
}
.container {
  display: grid;
  grid-template-columns: 200px 750px 100px 50px;
  padding: 15px 50px 0px 50px;
}
.selected-categories {
  padding-left: 250px;
  color: var(--color-blue-green);
  font-size: 14px;
  line-height: 20px;
}
</style>
