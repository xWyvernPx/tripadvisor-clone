<script setup lang="ts">
import store from "../../../store/store";

const onOutsideClick = () => {
  store.commit("toggleModal");
};
</script>
<template>
  <teleport to="body">
    <div class="modal-wrapper">
      <div class="modal-component">
        <slot></slot>
      </div>
      <div class="modal-backdrop" @click.self="onOutsideClick"></div>
    </div>
  </teleport>
</template>
<style>
.modal-wrapper {
  position: absolute;
  inset: 0;
  max-height: 100vh;
  z-index: var(--modalZIndex);
}
.modal-component {
  position: absolute;
  top: 25%;
  left: 50%;
  transform: translate(-50%, 0);
  z-index: 15;
}
.modal-backdrop {
  /* z-index: var(--modalZIndex); */
  inset: 0;
  position: absolute;
  background-color: var(--white);
  z-index: 1;
  opacity: 0.7;
}
</style>
