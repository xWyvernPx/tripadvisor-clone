<script setup lang="ts"></script>
<template>
  <div class="list">
    <div class="skeleton-card">
      <div class="skeleton-img"></div>
      <div class="skeleton-content">
        <div class="skeleton-title"></div>
        <div class="skeleton-title"></div>
        <div class="skeleton-title"></div>
      </div>
    </div>
    <div class="skeleton-card">
      <div class="skeleton-img"></div>
      <div class="skeleton-content">
        <div class="skeleton-title"></div>
        <div class="skeleton-title"></div>
        <div class="skeleton-title"></div>
      </div>
    </div>
    <div class="skeleton-card">
      <div class="skeleton-img"></div>
      <div class="skeleton-content">
        <div class="skeleton-title"></div>
        <div class="skeleton-title"></div>
        <div class="skeleton-title"></div>
      </div>
    </div>
  </div>
</template>
<style scoped>
.list {
  background-color: var(--white);
}
.skeleton-card {
  margin: 2rem 0;
  display: flex;
  padding: 4rem 2rem;
  gap: 1.5rem;
}
.skeleton-content {
  display: flex;
  flex-direction: column;
  justify-content: space-evenly;
}
.skeleton-img {
  background-color: var(--gray-95);
  border-radius: var(--radiusFullRounded);
  width: 10rem;
  aspect-ratio: 1;
}
.skeleton-title {
  width: 30rem;
  height: 1rem;
  background-color: var(--gray-95);
}
</style>
