<template>
  <div class="small-info">
    <slot/>
  </div>
</template>

<style scoped >
.small-info {
  font-size: 14px;
  color: var(--color-grey);
  text-align: left;
  align-content: center;
  width: 100%;
  overflow: hidden;
  white-space: nowrap;
  text-overflow: ellipsis;

}
</style>
