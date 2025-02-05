<script setup lang="ts">
import type { AnnouncementCardType } from '@/entities/announcement';
import AnnouncementCard from './AnnouncementCard.vue';

const {advertisementCards} = defineProps<{advertisementCards: AnnouncementCardType[]}>()


</script>

<template>
  <div class="advertisement-list">
    <AnnouncementCard v-for="advertisementCard in advertisementCards"
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
