<script setup lang="ts">
import { SearchIcon, LocationIcon } from "vue-tabler-icons";
import SearchItem from "./SearchItem.vue";
import { useForm, useField } from "vee-validate";
import { useRouter } from "vue-router";
import { useStore } from "vuex";
const { handleSubmit } = useForm({});
const { value } = useField("q");
const router = useRouter();
const store = useStore();
const onSubmitHandler = handleSubmit((values: any) => {
  store.commit("toggleModal");
  router.replace("/search?q=" + values.q);
});
</script>
<template>
  <form class="search-form" @submit="onSubmitHandler">
    <div class="search-area">
      <button type="submit"><search-icon></search-icon></button>
      <input type="text" name="q" v-model="value" placeholder="Where to ?" />
    </div>
    <div class="search-result">
      <SearchItem
        :icon="LocationIcon"
        :name="'Near By'"
        link="'/'"
      ></SearchItem>
      <SearchItem
        :icon="LocationIcon"
        :name="'Near By'"
        link="'/'"
      ></SearchItem>
      <SearchItem
        :icon="LocationIcon"
        :name="'Near By'"
        link="'/'"
      ></SearchItem>
      <SearchItem
        :icon="LocationIcon"
        :name="'Near By'"
        link="'/'"
      ></SearchItem>
      <SearchItem
        :icon="LocationIcon"
        :name="'Near By'"
        link="'/'"
      ></SearchItem>
    </div>
  </form>
</template>
<style scoped>
.search-form {
  padding: 1rem 1rem;
  background-color: var(--white);
  width: 70vw;
  height: fit-content;
  box-shadow: 0px 0px 10px -4px var(--black);
  border-radius: var(--radiusLarge);
}
.search-area {
  display: flex;
  border-bottom: 2px solid var(--black);
}
.search-form svg {
  transform: scale(1);
}
.search-form input {
  height: 5rem;
  font-size: 1.6rem;
  padding-left: 1rem;
  width: 100%;
}
.search-result {
  min-height: 10rem;
  width: 100%;
  padding: 1rem 0;
}
</style>
