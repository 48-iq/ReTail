<script setup lang="ts">

</script>

<template>
  <button >
    <slot/>
    <div class="row"/>
  </button>
</template>

<style scoped>
button {
  width: 227px;
  height: 30px;
  color: var(--color-black);
  background-color: var(--color-light-green);
  padding-left: 10px;
  padding-right: 5px;
  font-size: 16px;
  display: flex;
  justify-content: space-between;
  align-items: center;
  border: none;
  cursor: pointer;
}
button:hover {
  background-color: var(--color-blue);
}
.row {
  width: 20px;
  height: 20px;
  background-image: url('@/assets/images/category_row.png');
  background-color: var(--color-transparent);
}
</style>
