<script setup lang="ts">
import { reactive, ref } from "vue";
import {
  BrandSafariIcon,
  HeartIcon,
  BellIcon,
  ShoppingCartIcon,
} from "vue-tabler-icons";
import SearchForm from "../Form/SearchForm.vue";
import Modal from "../Modal/Modal.vue";
import HeaderSearch from "./HeaderSearch.vue";
import UserMenu from "./UserMenu.vue";
import PrimarySolidBlackButton from "../Button/PrimarySolidBlackButton.vue";
import { useRouter } from "vue-router";
import { useStore } from "vuex";
const headerSearch = ref(false);
const userMenuShow = ref(false);
const router = useRouter();
const onMenuClick = () => {
  userMenuShow.value = true;
  console.log(userMenuShow.value);
  document.body.addEventListener("click", (e: MouseEvent) => {
    e.stopPropagation();
    userMenuShow.value = false;
    window.removeEventListener("click", (e: MouseEvent) => {});
  });
};
const {
  state: {
    auth: { isLoggedIn, user },
    modal: { isShow },
  },

  commit,
} = useStore();
console.log(isLoggedIn);
const onLogoClick = () => {
  router.push("/");
};
</script>

<template>
  <header class="header">
    <div class="logo-wrapper" @click="onLogoClick">
      <img
        src="https://static.tacdn.com/img2/brand_refresh/Tripadvisor_lockup_horizontal_secondary_registered.svg"
        alt="logo"
      />
    </div>
    <header-search :is-shown="headerSearch"></header-search>
    <div class="nav">
      <router-link to="/">
        <brand-safari-icon></brand-safari-icon>
        Explore
      </router-link>

      <router-link to="/">
        <heart-icon> </heart-icon>
        Trips
      </router-link>
      <router-link to="/">
        <bell-icon></bell-icon>
        Alerts
      </router-link>
      <div class="user-menu" @click="onMenuClick" v-if="isLoggedIn">
        <div class="user-ava">
          <img src="https://source.unsplash.com/random" alt="" />
        </div>
        <user-menu v-if="userMenuShow"></user-menu>
      </div>
      <div class="login-button">
        <primary-solid-black-button @click="commit('toggleModal', 'LOGIN')">
          Login</primary-solid-black-button
        >
      </div>
      <div class="cart">
        <shopping-cart-icon></shopping-cart-icon>
        <span>Cart</span>
      </div>
    </div>
  </header>
</template>

<style scoped>
.login-button {
  width: 6.5rem;
}
.login-button button {
  font-weight: 600;
}
.login-button button:hover {
  opacity: 0.8;
}
.user-ava {
  width: 4.5rem;
  aspect-ratio: 1;
  border-radius: 50%;
}
.user-ava img {
  width: 100%;
  height: 100%;
  object-fit: cover;
  border-radius: 50%;
}
.nav {
  display: flex;
  gap: 1.5rem;
  align-items: center;
}
.user-menu {
  cursor: pointer;
  position: relative;
}
.nav a,
.cart {
  display: flex;
  cursor: pointer;
  align-items: center;
  padding: 0.75rem;
  border-radius: 3rem;
  gap: 0.5rem;
  color: var(--black);
  font-size: 1.75rem;
  text-decoration: none;
}
.nav a:hover,
.cart:hover {
  background-color: var(--clearCircularButtonFillHover);
}
.logo-wrapper {
  height: 100%;
  aspect-ratio: 16/9;
  cursor: pointer;
}
.logo-wrapper img {
  width: 120%;
  height: 120%;
  object-fit: contain;
}
header {
  width: 100%;
  height: var(--header-height);
  max-width: 1200px;
  padding: 1rem 2rem;
  margin-left: auto;
  margin-right: auto;
  background-color: var(--white);
  z-index: 10;
  position: sticky;
  top: 0;
  display: flex;
  justify-content: space-between;
  align-items: center;
}
</style>
