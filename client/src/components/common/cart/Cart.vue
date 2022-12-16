<script setup lang="ts">
import { MinusIcon, XIcon } from "vue-tabler-icons";
import { useStore } from "vuex";
import CartItem from "./CartItem.vue";
import PrimarySolidYellowButton from "../Button/PrimarySolidYellowButton.vue";
const {
  state,

  commit,
} = useStore();
console.log(state.cart.isShowCart);
</script>
<template>
  <div class="cart" :class="{ activeCart: state.cart.isShowCart }">
    <div class="heading">
      <span class="heading">cart</span>
      <button @click="commit('toggleCart')"><MinusIcon /></button>
    </div>
    <div class="list-item">
      <CartItem />
      <CartItem />
      <CartItem />
    </div>
    <div class="checkout-area">
      <div class="cart-field">
        <span class="fee">Booking Fee</span>
        <span class="fee-value">0</span>
      </div>
      <div class="cart-field">
        <span class="subtotal">Subtotal</span>
        <span class="subtotal-value">1,000,300</span>
      </div>
      <div class="cart-field">
        <span class="total">Total</span>
        <span class="total-value">1,000,300</span>
      </div>
      <PrimarySolidYellowButton>Checkout</PrimarySolidYellowButton>
    </div>
  </div>
</template>
<style scoped>
.list-item {
  flex: auto 1 1;
}
.checkout-area {
  padding: 1rem 0;
  flex: fit-content 0 0;
}
.cart-field {
  display: flex;
  justify-content: space-between;
  color: var(--gray-30);
  font-size: 1.4rem;
  margin-bottom: 0.75rem;
}
.total,
.total-value {
  font-size: 1.6rem;
  color: var(--black);
  margin-bottom: 1.5rem;
}
.heading span {
  font-size: 3.2rem;
  text-transform: capitalize;
}
.cart {
  position: fixed;
  top: 0;
  right: 0;
  width: 45rem;
  height: 70rem;
  background-color: var(--white);
  padding: 2rem 2rem;
  border-radius: var(--radiusSmall);
  box-shadow: 0px 0px 10px -4px;
  transform: translateX(110%);
  transition: all 0.3s linear;
  display: flex;
  flex-direction: column;
  z-index: var(--cartIndex);
}
.cart.activeCart {
  transform: translateX(0%);
}
.heading {
  width: 100%;
  display: flex;
  justify-content: space-between;
  align-items: center;
  flex: fit-content 0 0;
}
</style>
