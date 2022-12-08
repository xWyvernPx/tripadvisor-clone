<script setup lang="ts">
import { computed } from "@vue/reactivity";

interface RatingProps {
  rating: number;
}
defineProps<RatingProps>();
var roundNearQtr = function (number: number) {
  return Number.parseFloat((Math.round(number * 4) / 4).toFixed(2));
};
const ratingArr = (rating: number) => {
  let fullRate = Math.floor(rating);
  const numbers = [0, 0, 0, 0, 0];
  for (var i = 0; i < fullRate; i++) {
    numbers[i] = 1;
  }
  if (rating - fullRate > 0) {
    numbers[fullRate] = roundNearQtr(rating - fullRate);
    fullRate++;
  }
  for (var i = 5 - fullRate; i >= fullRate; i--) {
    numbers[i] = 0;
  }
  return numbers;
};
</script>
<template>
  <div class="container">
    <div
      class="round"
      v-for="rate in ratingArr(rating)"
      :class="{
        full: rate == 1,
        mask: rate > 0,
        half: rate == 0.5,
        lqtr: rate == 0.25,
        hqtr: rate == 0.75,
        disableBorder: rate > 0.75,
      }"
    ></div>
  </div>
</template>
<style scoped>
.mask::after {
  content: "";
  position: absolute;
  top: 0;
  bottom: 0;

  /* border-radius: var(--radiusFullRounded); */
  background-color: var(--bubbleIcon);
}
.full::after {
  width: 100%;
}
.half::after {
  width: 50%;
}
.lqtr::after {
  width: 25%;
}
.hqtr::after {
  width: 75%;
}
.round.disableBorder {
  /* box-shadow: ; */
}
.round {
  width: 1rem;
  aspect-ratio: 1;
  border-radius: var(--radiusFullRounded);
  box-shadow: 0px 0px 0px 1px var(--bubbleIcon);
  position: relative;
  overflow: hidden;
}
.container {
  display: flex;
  gap: 0.5rem;
}
</style>
