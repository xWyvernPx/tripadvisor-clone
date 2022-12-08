<script setup lang="ts">
import { ref } from "vue";
import LoginOptions from "./LoginOptions.vue";
import LoginWithMail from "./LoginWithMail.vue";
import SignUp from "./SignUp.vue";
const stage = ref<"Oauth" | "Mail" | "SignUp">("Oauth");
</script>
<template>
  <div class="form-wrapper">
    <LoginOptions
      v-if="stage === 'Oauth'"
      @login-mail="() => (stage = 'Mail')"
    />
    <LoginWithMail
      v-if="stage === 'Mail'"
      @go-back="() => (stage = 'Oauth')"
      @register="() => (stage = 'SignUp')"
    />
    <sign-up
      v-if="stage === 'SignUp'"
      @go-back="() => (stage = 'Oauth')"
      @register="() => (stage = 'Mail')"
    ></sign-up>
  </div>
</template>

<style scoped>
.form-wrapper {
  width: 50rem;
  height: 70rem;
  padding: 6.5rem 5rem;

  background-color: var(--white);
  border-radius: var(--radiusLarge);
  box-shadow: 0px 0px 10px -3px var(--gray-50);
  z-index: calc(var(--modalZIndex) + 1);
  overflow: auto;
}
</style>
<style>
.modal-component {
  top: 50% !important;
  transform: translate(-50%, -50%) !important;
  position: fixed;
}
</style>
