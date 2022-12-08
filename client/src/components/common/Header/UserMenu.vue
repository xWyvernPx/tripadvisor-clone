<script setup lang="ts"></script>
<template>
  <div class="menu">
    <router-link to="/">View profile</router-link>
    <router-link to="/">Bookings</router-link>
    <router-link to="/">Account info</router-link>
    <router-link to="/">Sign out</router-link>
  </div>
</template>
<style scoped>
.menu {
  padding: 2rem 1rem;
  width: 18rem;
  position: absolute;
  right: 0;
  bottom: 0;
  transform: translateY(100%);
  border-radius: var(--radiusLarge);
  display: flex;
  gap: 1rem;
  flex-direction: column;
  background-color: var(--white);
  box-shadow: 0px 0px 10px -3px var(--gray-15);
}
.menu a {
  font-size: 1.6rem;
  padding: 1.5rem;
}
.menu a:hover {
  background-color: var(--menuItemHover);
}
</style>
