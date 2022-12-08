<template>
  <div class="">
    <h2 class="section-title">Find the thing to do by interest</h2>
    <h4>Collections of our best bookable experience</h4>

    <swiper
      :slides-per-view="2"
      :space-between="50"
      @swiper="onSwiper"
      :modules="modules"
      navigation
    >
      <swiper-slide>Slide 1</swiper-slide>
      <swiper-slide>Slide 2</swiper-slide>
      <swiper-slide>Slide 3</swiper-slide>
    </swiper>
  </div>
</template>
<script setup lang="ts">
import { Swiper, SwiperSlide } from "swiper/vue";
import { Navigation, Pagination, Scrollbar, A11y } from "swiper";

// Import Swiper styles
import "swiper/css";
import "swiper/css/bundle";
import { ref } from "vue";

const onSwiper = (swiper: any) => {
  console.log(swiper);
};
const onSlideChange = () => {
  console.log("slide change");
};
const modules = ref([Navigation, Pagination, Scrollbar, A11y]);
</script>
<style scoped></style>
