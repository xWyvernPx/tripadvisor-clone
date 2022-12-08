<template>
  <div class="recent-page">
    <h2>Your recent searches</h2>
    <div class="search-list">
      <RecentSearchCard
        v-for="item in recentSearch"
        :key="item.term"
        :term="item.term"
        :address="item.address"
        :type="item.type"
        :link="item.link"
      />
    </div>
  </div>
</template>
<script setup lang="ts">
import { RecentSearchCardProps } from "./RecentSearchCard.vue";
import RecentSearchCard from "./RecentSearchCard.vue";
//MOCK DATA
const recentSearch: RecentSearchCardProps[] = [
  {
    type: "SEARCH",
    term: "Thing To Do in Fairbank",
    link: "/",
  },
  {
    type: "ACCOMODATION",
    term: "Fairbank",
    address: "Alaska",
    link: "/",
  },
  {
    type: "SEARCH",
    term: "Hotels in Rome",
    link: "/",
  },
  {
    type: "SEARCH",
    term: "Thing To Do in Rome",
    link: "/",
  },
];
</script>
<style scoped>
.recent-page {
  margin-top: 6rem;
}
.recent-page h2 {
  font-size: 2.5rem;
}
.search-list {
  margin-top: 2rem;
  display: flex;
  flex-wrap: wrap;
  gap: 1rem;
}
</style>
