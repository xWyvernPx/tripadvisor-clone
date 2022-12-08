<script setup lang="ts">
import Rating from "../Rating/Rating.vue";
import { RouterLink } from "vue-router";
import { HeartIcon } from "vue-tabler-icons";

const emit = defineEmits(["AddToFavorites"]);
</script>
<template>
  <router-link :to="'/' + ''" class="card">
    <div class="image">
      <img src="https://source.unsplash.com/random" alt="" />
    </div>
    <span class="name">Lorem ipsum dolor sit amet.</span>
    <div class="rating">
      <rating :rating="1.5"></rating>
      <span>5123</span>
    </div>
    <div class="fav-button" @click="() => emit('AddToFavorites')">
      <heart-icon></heart-icon>
    </div>
  </router-link>
</template>
<style scoped>
.card {
  max-width: 100%;
  min-width: 100%;
  width: 26rem;
  display: block;
  position: relative;
}
.image {
  width: 100%;
  aspect-ratio: 1;
}
img {
  width: 100%;
  height: 100%;
  object-fit: cover;
}
.name {
  display: block;
  font-size: 1.8rem;
}
.name,
.rating {
  margin-top: 1rem;
}
.rating {
  display: flex;
  align-items: center;
  gap: 1rem;
}
.rating span {
  color: var(--gray-50);
}
.fav-button {
  background-color: var(--white);
  padding: 0.75rem;
  /* width: 4rem; */
  aspect-ratio: 1;
  position: 5;
  border-radius: var(--radiusFullRounded);
  right: 1rem;
  top: 1rem;
  display: grid;
  place-items: center;
  position: absolute;
}

.fav-button svg {
  stroke-width: 1.5px;
}
.card:hover .image {
  opacity: 0.85;
}
.card:hover .name {
  text-decoration: underline;
}
</style>
