<script setup lang="ts">
import { ref } from 'vue';

  const curImage = ref(0);

  const {images} = defineProps<{
    images: string[]
  }>() 

</script>

<template>
  <div class="main-image"/>
  <div class="other-images">
    <div class="image" v-for="(i, n) in images" :key="n" @click="curImage = n"/>
  </div>
</template>
<style scoped>
.main-image {
  width: 700px;
  height: 394px;
}

.other-images {
  width: 700px;
  height: 110px;
  display: flex;
  overflow-x: scroll;
}
</style>