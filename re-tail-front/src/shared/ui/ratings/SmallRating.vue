<script setup lang="ts">
import { computed } from 'vue';
import RatingStar from './RatingStar.vue';

const props = defineProps<{rating: number}>()

const starsWidths = computed(() => {
  const widths: number[] = []
  for (let i = 0; i < props.rating; i++) {
    const j = props.rating - i
    if (j < 1 && j >= 0.5 ) widths.push(0.5)
    else if (j >= 0.5) widths.push(1)
  }
  return widths;
})

</script>

<template>
  <div class="small-rating">
    <div class="rate-container">{{ props.rating }}/5</div>
    <div class="stars-container">
      <RatingStar v-for="i in starsWidths" :key="i" :style="{height: '10px', width: `${i * 10}px`}"/>
    </div>
  </div>
</template>

<style scoped>
.small-rating {
  display: flex;
  height: 30px;
  align-items: center;
  gap: 5px;
}
.rate-container {
  display: flex;
  align-items: center;
  justify-content: center;
  height: 30px;
}
.stars-container {
  display: flex;
  align-items: center;
  height: 10px;
  gap: 2px;
  justify-content: left;

}
</style>
