<script setup lang="ts">
import type { AdvertisementCardType } from '@/entities/advertisement';
import BaseButton from '@/shared/ui/buttons/BaseButton.vue';
import CardImage from '@/shared/ui/images/CardImage.vue';
import PriceInfo from '@/shared/ui/info/PriceInfo.vue';
import SmallRating from '@/shared/ui/ratings/SmallRating.vue';
import SmallTitle from '@/shared/ui/titles/SmallTitle.vue';
import { useRouter } from 'vue-router';

const router = useRouter()

const routeToUser = (id: string) => {
  router.push(`/users/${id}`)
}

const routeToAdvertisement = (id: string) => {
  router.push(`/advertisements/${id}`)
}

const { advertisementCard } = defineProps<{advertisementCard: AdvertisementCardType}>()

</script>

<template>
  <div class="advertisement-card">
    <CardImage :src="advertisementCard.image" @click="routeToAdvertisement(advertisementCard.id)"/>
    <PriceInfo>{{ advertisementCard.price }} Р</PriceInfo>
    <SmallTitle :style="{height: '40px'}">{{ advertisementCard.title }}</SmallTitle>
    <div class="creator">
      Пользователь <SmallRating :rating="advertisementCard.creator.rating"/>
    </div>
    <div class="seller-link" @click="routeToUser(advertisementCard.creator.id)">
      {{ advertisementCard.creator.nickname }}
    </div>
    <BaseButton>В избранное</BaseButton>
  </div>
</template>

<style scoped>
.advertisement-card {
  width: 200px;
  height: 440px;
}
.creator {
  height: 20px;
  display: flex;
  align-items: center;
  gap: 10px;
}
.seller-link {
  height: 20px;
  margin-top: 5px;
  overflow: hidden;
  white-space: nowrap;
  text-overflow: ellipsis;
  margin-bottom: 5px;
  cursor: pointer;
  width: fit-content;
  color: var(--color-dark-green);
}
</style>
