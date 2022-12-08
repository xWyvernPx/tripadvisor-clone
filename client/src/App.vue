<script setup lang="ts">
import { useStore } from "vuex";
import Footer from "./components/common/Footer/Footer.vue";
import LoginFormMain from "./components/common/Form/Login/LoginFormMain.vue";
import SearchForm from "./components/common/Form/SearchForm.vue";
import Header from "./components/common/Header/Header.vue";
import Modal from "./components/common/Modal/Modal.vue";
import { ModalState } from "./store/modules/modal";
const store = useStore();
const { isShow, type } = store.state.modal as ModalState;
</script>

<template>
  <Header></Header>
  <div class="page">
    <RouterView></RouterView>
  </div>
  <Modal v-if="store.state.modal.isShow">
    <SearchForm v-if="store.state.modal.type === 'SEARCH'" />
    <LoginFormMain v-if="store.state.modal.type === 'LOGIN'" />
  </Modal>
  <Footer></Footer>
</template>

<style scoped>
.page {
  max-width: 100%;
  width: var(--maxPageWidth);
  margin-left: auto;
  margin-right: auto;
}
</style>
<style>
/* SWIPER CUSTOM*/
.swiper-button-prev,
.swiper-button-next {
  color: var(--black);
  width: fit-content !important;
  background-color: var(--white);
  aspect-ratio: 1;
  border-radius: var(--radiusFullRounded);
  border: 2px solid var(--black);
}
.swiper-button-prev {
  transform: translateX(-20%);
}
.swiper-button-next {
  transform: translateX(20%);
}
.swiper-button-prev::after,
.swiper-button-next::after {
  font-size: 2rem !important;
  color: var(--black);
  stroke-width: 1px;
  display: inline-block;
  font-style: normal;
  font-variant: normal;
  text-rendering: auto;
  -webkit-font-smoothing: antialiased;
}
.swiper-button-prev::after {
  content: "\f060" !important;
  font-family: "Font Awesome 6 Free", Times, serif !important;
  font-weight: 600;
}
.swiper-button-next::after {
  content: "\f061" !important;
  font-family: "Font Awesome 6 Free", Times, serif !important;
  font-weight: 600;
  /* font-weight: 600; */
}
</style>
