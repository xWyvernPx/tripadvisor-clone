<script setup lang="ts">
interface SearchItemProps {
  name: string;
  link: string;
  icon: any;
}
defineProps<SearchItemProps>();
</script>
<template>
  <router-link :to="link" class="search-item">
    <div class="icon">
      <component :is="icon"></component>
    </div>
    <span>{{ name }}</span>
  </router-link>
</template>
<style scoped>
.search-item {
  width: 100%;
  height: 7.2rem;
  padding: 1.6rem 2.4rem;
  display: flex;
  gap: 1rem;
  color: var(--black);
  font-size: 1.6rem;
  align-items: center;
  border-bottom: 1px solid var(--menuItemHover);
}
.search-item:hover {
  background-color: var(--menuItemHover);
}
.icon {
  flex: 4rem 0 0;
  aspect-ratio: 1;
  border-radius: var(--radiusFullRounded);
  border: 2px solid var(--gray-80);
  display: grid;
  place-items: center;
}
</style>
