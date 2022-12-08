<script setup lang="ts">
import { ref, watch, watchEffect } from "vue";
import { SearchIcon } from "vue-tabler-icons";
const isSearchFocused = ref(false);
const searchRef = ref<HTMLInputElement>();

const onSearchFocused = () => {
  isSearchFocused.value = true;
  window.addEventListener("scroll", () => {
    isSearchFocused.value = false;
    if (searchRef.value) {
      searchRef.value.blur();
    }
    window.removeEventListener("scroll", () => {});
  });
};
</script>

<template>
  <div class="search-homepage">
    <img
      src="https://static.tacdn.com/img2/brand/home/homemar2022_dt_trans.png"
      alt=""
    />
    <div class="search-area">
      <form :class="{ focused: isSearchFocused }" class="search">
        <search-icon></search-icon>
        <input
          type="text"
          ref="searchRef"
          placeholder="Where to?"
          @focus="onSearchFocused"
          @blur="() => (isSearchFocused = false)"
        />
        <div class="search-result" v-if="isSearchFocused"></div>
      </form>
    </div>
    <teleport to="body" v-if="isSearchFocused">
      <div class="backdrop"></div>
    </teleport>
  </div>
</template>
<style scoped>
.search-homepage {
  margin-top: 2rem;
  position: relative;
}
.focused {
  z-index: 12;
  border-radius: var(--radiusLarge) !important;
  border-bottom: 2px solid var(--black);
}
.search-homepage img {
  width: 100%;
  height: 100%;
  object-fit: contain;
  border-radius: var(--radiusSmall);
}
.search-input {
}
.search {
  height: fit-content;
  width: 80%;
  background-color: var(--white);
  border-radius: var(--radiusFullRounded);

  position: absolute;
  top: 50%;
  left: 50%;
  transform: translate(-50%, -50%);
  border: 1px black solid;
  /* display: flex; */
  gap: 2rem;
  padding: 0 2rem;
  align-items: center;
  box-shadow: 2px 2px 10px -4px var(--black);
  transition: border-radius 0.55s linear;
}
form svg {
  position: absolute;
  left: 1rem;
  top: 50%;
  transform: translateY(-50%);
}
.search input {
  font-size: 1.75rem;
  width: 100%;
  padding-left: 4rem;
  margin-top: 0.5rem;
  margin-bottom: 0.5rem;
  height: 5rem;
}
.backdrop {
  position: fixed;
  inset: 0;
  background-color: var(--white);
  opacity: 0.7;
  z-index: 11;
}
.search-result {
  /* position: absolute; */
  transition: all 0.5s linear;
  width: 100%;
  /* min-height: 40rem; */
  background-color: var(--white);
}
</style>
