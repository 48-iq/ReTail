<template>
  <button>
    <slot/>
  </button>
</template>

<style scoped>
  button {
    background-color: var(--color-white);
    color: var(--color-blue);
    border: solid 1px var(--color-blue);
    height: 50px;
    width: 190px;
    font-size: 20px;
    cursor: pointer;

  }
</style>
