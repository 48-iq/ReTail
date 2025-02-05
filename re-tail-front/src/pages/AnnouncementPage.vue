<script setup lang="ts">
import AppHeader from '@/widgets/AppHeader.vue';
import { useRoute} from 'vue-router';

const route = useRoute();
const {id} = route.params;

</script>

<template>
  <AppHeader/>
  
  
</template>