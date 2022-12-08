<script setup lang="ts">
import OutlineBlackButton from "../../Button/OutlineBlackButton.vue";
defineEmits(["LoginMail"]);
</script>
<template>
  <div>
    <div class="img">
      <img src="/icon.webp" alt="" />
    </div>
    <h1>Sign in to unlock the best of Tripadvisor.</h1>
    <div class="options">
      <outline-black-button>Continue with Google</outline-black-button>
      <outline-black-button>Continue with Facebook</outline-black-button>
      <outline-black-button @click="$emit('LoginMail')"
        >Continue with email</outline-black-button
      >
    </div>
  </div>
</template>

<style scoped>
.img {
  width: 4.8rem;
  aspect-ratio: 1;
  margin-bottom: 2rem;
}
img {
  width: 100%;
  height: 100%;
  object-fit: cover;
}
h1 {
  margin-bottom: 6rem;
  font-size: 2.8rem;
}
.options {
  display: flex;
  flex-direction: column;
  gap: 2rem;
}
</style>
