<template>
  <button><slot/></button>
</template>

<style scoped>
button {
  width: 200px;
  height: 40px;
  font-size: 14px;
  text-align: center;
  align-content: center;
  background-color: var(--color-dark-green);
  border: 1px solid var(--color-blue-green);
  color: var(--color-white);
  cursor: pointer;
}
</style>
