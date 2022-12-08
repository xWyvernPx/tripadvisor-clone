<script setup lang="ts">
// import { Component } from 'vue';

import store from "../../store/store";

export interface TypeCardProps {
  name: string;
  icon?: any;
}
defineProps<TypeCardProps>();
const onTypeCardClick = () => {
  store.commit("toggleModal", "SEARCH");
  // TODO : handle each type search
};
</script>

<template>
  <div class="accomodation-type-card" @click="onTypeCardClick">
    <span class="type-name">{{ name }}</span>
    <component :is="icon"></component>
  </div>
</template>

<style>
.accomodation-type-card {
  padding: 1.5rem;
  display: flex;
  align-items: flex-start;
  justify-content: space-between;
  width: 18rem;
  height: 6.8rem;
  font-size: 1.75rem;
  border: 1px solid var(--black);
  border-radius: var(--radiusLarge);
  cursor: pointer;
  transition: all 0.15s linear;
}
.accomodation-type-card:hover {
  background-color: var(--black);
  color: var(--white);
}
</style>
