<script setup lang="ts">
import { defineAsyncComponent } from "vue";
import RecentSearchSection from "../components/HomePage/section/RecentSearch/RecentSearchSection.vue";
import SearchSection from "../components/HomePage/section/search/SearchSection.vue";
import SuggestionSection from "../components/HomePage/section/SuggestSection/SuggestionSection.vue";
import TypeSection from "../components/HomePage/TypeSection.vue";
import Loading from "../components/common/Loading/Loading.vue";

// const SuggestionSection = defineAsyncComponent({
//   loader:()=> import("../components/HomePage/section/SuggestSection/SuggestionSection.vue"),
//   loadingComponent:
// })
</script>

<template>
  <type-section></type-section>
  <search-section></search-section>
  <!-- section-inject -->
  <recent-search-section></recent-search-section>
  <suggestion-section></suggestion-section>
  <suggestion-section></suggestion-section>
  <suggestion-section></suggestion-section>
</template>

<style scoped></style>
