<script setup lang="ts">
import { computed, onMounted, ref, watch } from "vue";
import { useRoute, useRouter } from "vue-router";
import { SearchIcon } from "vue-tabler-icons";
import TextField from "../components/common/Form/TextField.vue";
import PrimarySolidButton from "../components/common/Button/PrimarySolidButton.vue";
import SearchResultSkeleton from "../components/SearchPage/SearchResultSkeleton.vue";
const route = useRoute();
const router = useRouter();
interface PageProps {
  q?: string;
}
type KindOfSearch = "ALL" | "HOTEL" | "RESTAURANT";

const kindOfSearch = ref<"ALL" | "HOTEL" | "RESTAURANT">("ALL");
const kindOfSearchTabs: { name: string; type: KindOfSearch }[] = [
  {
    name: "All result",
    type: "ALL",
  },
  {
    name: "Hotels",
    type: "HOTEL",
  },
  {
    name: "Restaurants",
    type: "RESTAURANT",
  },
];
defineProps<PageProps>();
const q = route.query.q as string;
const isActiveTab = computed(
  (typeName: KindOfSearch, currentType: KindOfSearch): Boolean =>
    typeName === currentType
);
</script>
<template>
  <section class="heading">
    <div class="search-form">
      <form action="" @submit.prevent="() => router.replace('/search?q=' + q)">
        <div class="search-field">
          <text-field
            :name="q"
            :icon="SearchIcon"
            :placeholder="'Search tripadvisor'"
          ></text-field>
        </div>
        <div class="button-search">
          <primary-solid-button type="submit">Search</primary-solid-button>
        </div>
      </form>
    </div>
    <div class="result-type">
      <a
        href="#"
        @click.prevent="kindOfSearch = tab.type"
        v-for="tab in kindOfSearchTabs"
        class="tab"
        :class="{
          tabActive: kindOfSearch === tab.type,
        }"
        >{{ tab.name }}</a
      >
    </div>
  </section>
  <section class="search-result">
    <span>Search result for ""</span>
    <search-result-skeleton></search-result-skeleton>
  </section>
</template>
<style scoped>
.result-type a {
  position: relative;
}
.tab::after {
  content: "";
  position: absolute;
  right: 0;
  left: 0;
  height: 2px;
  background-color: var(--green-30);
  bottom: -1rem;
  opacity: 0;
  transition: all 0.25s linear;
}
.result-type {
  margin-top: 3rem;
  display: flex;
  gap: 3rem;
  font-size: 1.5rem;
}
.tab.tabActive::after {
  opacity: 1;
}
.tabActive {
}
.heading {
}
.search-field {
  display: flex;
  width: 40%;
}
.search-form form {
  display: flex;
}
.button-search {
  margin-left: 2rem;
  width: 20rem;
}
section {
  max-width: 100%;
  width: var(--maxPageWidth);
  margin-left: auto;
  margin-right: auto;
  padding: 1rem 2rem;
}
.search-result {
  margin-top: 2rem;
  background-color: var(--gray-95);
}
</style>
