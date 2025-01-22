<script setup lang="ts">

  const model = defineModel()
</script>

<template>
  <input class="search-bar"
  type="text"
  placeholder="Найти на ReTail..."
  v-model="model"/>
</template>

<style lang="css" scoped>
  .search-bar {
    width: 700px;
    height: 50px;
    background-color: var(--color-white);
    border: solid 1px var(--color-blue);
    font-size: 20px;
    color: var(--color-blue);
    padding-left: 20px;
  }
  .search-bar::placeholder {
    color: var(--color-blue);
  }
</style>
