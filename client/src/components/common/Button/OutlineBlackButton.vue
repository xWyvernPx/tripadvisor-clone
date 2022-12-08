<script setup lang="ts"></script>
<template>
  <button>
    <slot></slot>
  </button>
</template>
<style scoped>
button {
  border-radius: var(--radiusFullRounded);
  font-size: 1.8rem;
  color: var(--black);
  width: 100%;
  line-height: 1.5;
  padding: 0.5rem 0;
  background-color: var(--white);
  border: 2px solid var(--black);
  font-family: "Trip Sans";
}
</style>
