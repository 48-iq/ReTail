<script setup lang="ts">

const props = defineProps<{src?: string|null}>()

</script>
<template>
  <div v-if="props.src" class='card-image' :style="{backgroundImage: `url(${props.src})`}"/>
  <div v-else class='card-image default-image'/>
</template>

<style scoped>
.card-image {
  width: 200px;
  height: 265px;
  background-repeat: no-repeat;
  background-position: center;
  background-size: contain;
  cursor: pointer;
}
.card-image:hover {
  background-size: 110%;
}
.default-image {
  background-image: url('@/assets/images/default_image.png');
}
</style>
