<script setup lang="ts">
import type { AdvertisementCardType } from '@/entities/advertisement';
import Advertisement from './AdvertisementCard.vue';

const advertisementCardEx: AdvertisementCardType = {
  id: '123',
  title: 'Название товара',
  price: 123,
  creator: {
    id: '123',
    nickname: 'nickname',
    rating: 2
  },
  image: 'https://i.pinimg.com/474x/5c/99/27/5c9927b47e49bc6ff7e7f05d3a6f2fc7.jpg',
}

const advertisementCards = [
  {...advertisementCardEx, id: '1'},
  {...advertisementCardEx, id: '2'},
  {...advertisementCardEx, id: '3'},
  {...advertisementCardEx, id: '4'},
  {...advertisementCardEx, id: '5'},
  {...advertisementCardEx, id: '6'},
  {...advertisementCardEx, id: '7'},
  {...advertisementCardEx, id: '8'},
  {...advertisementCardEx, id: '9'},
  {...advertisementCardEx, id: '10'},
]

</script>

<template>
  <div class="advertisement-list">
    <Advertisement v-for="advertisementCard in advertisementCards"
    :key="advertisementCard.id"
    :advertisement-card="advertisementCard"/>
  </div>
</template>

<style scoped>
.advertisement-list {
  width: 100%;
  display: grid;
  grid-template-columns: 1fr 1fr 1fr 1fr 1fr;
  gap: 25px;

  padding: 50px;
}
</style>
