<script setup lang="ts">
import { TrashIcon } from "vue-tabler-icons";
import Rating from "../Rating/Rating.vue";
</script>
<template>
  <div class="cart-item">
    <div class="image">
      <img src="https://source.unsplash.com/random" alt="" />
    </div>
    <div class="content-container">
      <h3 class="name">Hotel Barroco</h3>
      <div class="rating-review">
        <Rating :rating="3.5" />
        <span>100 reviews</span>
      </div>
      <div class="date">
        <span class="from"></span>
        <span class="to"></span>
      </div>
      <div class="amount">
        <span>{{ "1 room , 2 adults, " }}</span>
      </div>
      <span class="total">Total {{ "1030$" }}</span>
    </div>
    <div class="remove">
      <button>
        <TrashIcon />
      </button>
    </div>
  </div>
</template>

<style scoped>
.remove {
  display: grid;
  place-items: center;
}
.content-container {
  flex: auto 1 1;
}
.amount {
  margin-bottom: 0.75rem;
  font-size: 1.4rem;
}
.name {
  font-size: 2.2rem;
  margin-bottom: 1rem;
}
.total {
  font-size: 1.6rem;
}
.rating-review {
  display: flex;
  gap: 1rem;
  margin-bottom: 1rem;
}
.remove svg {
  transition: all 0.2s linear;
}
.remove:hover svg {
  transform: rotateZ(22deg);
}
.image {
  height: 90%;
  aspect-ratio: 1;
}
.cart-item {
  width: 100%;
  height: 10rem;
  border-bottom: 1px solid var(--gray-80);
  background-color: var(--white);

  display: flex;
  gap: 1rem;
  margin-bottom: 0.5rem;
}
.cart-item:last-child {
  border-bottom: none;
}
</style>
