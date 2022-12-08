<template>
  <router-link :to="link">
    <div class="card-wrapper">
      <search-icon v-if="type === 'SEARCH'"></search-icon>
      <map-pin-icon v-else></map-pin-icon>
      <div class="content">
        <h5 class="term">{{ term }}</h5>
        <h6>{{ address }}</h6>
      </div>
    </div>
  </router-link>
</template>
<script setup lang="ts">
import { SearchIcon, MapPinIcon } from "vue-tabler-icons";
export interface RecentSearchCardProps {
  type: "SEARCH" | "ACCOMODATION";
  term: string;
  address?: string;
  link: string;
}
defineProps<RecentSearchCardProps>();
</script>
<style>
.card-wrapper {
  padding: 1.5rem;
  width: fit-content;
  display: flex;
  gap: 1rem;
  border-radius: var(--radiusLarge);
  align-items: center;
  border: var(--lightButtonStroke) 2px solid;
  color: var(--black);
  transition: all 0.2s linear;
  min-height: 7rem;
}
.card-wrapper:hover {
  color: var(--white);
  background-color: var(--black);
  border-color: var(--black);
}
.content {
  display: flex;
  flex-direction: column;
  justify-content: space-between;
}
.term {
  font-weight: 600;
  font-size: 1.75rem;
}
.content h6 {
  font-weight: normal;
  font-size: 1.5rem;
  color: var(--gray-50);
}
</style>
