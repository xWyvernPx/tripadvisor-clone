<script setup lang="ts">
import { Swiper, SwiperSlide } from "swiper/vue";
import { Navigation } from "swiper";

// Import Swiper styles
import "swiper/css";
import "swiper/css/bundle";
import { ref } from "vue";
import HotelCard from "../../../common/Card/HotelCard.vue";
const modules = ref([Navigation]);
interface SuggestionSectionProps {
  header?: string;
  subheader?: string;
  listHotel?: any[];
}
defineProps<SuggestionSectionProps>();
</script>
<template>
  <div class="section">
    <h2>{{ header || "Ways to tour Ho Chi Minh City" }}</h2>
    <h3>
      {{
        subheader ||
        "Book these experiences for a close-up look at Ho Chi Minh City."
      }}
    </h3>
    <swiper
      class="container"
      :slides-per-view="5"
      :space-between="20"
      :modules="modules"
      navigation
    >
      <SwiperSlide>
        <HotelCard />
      </SwiperSlide>
      <SwiperSlide>
        <HotelCard />
      </SwiperSlide>
      <SwiperSlide>
        <HotelCard />
      </SwiperSlide>
      <SwiperSlide>
        <HotelCard />
      </SwiperSlide>
      <SwiperSlide>
        <HotelCard />
      </SwiperSlide>
      <SwiperSlide>
        <HotelCard />
      </SwiperSlide>
      <SwiperSlide>
        <HotelCard />
      </SwiperSlide>
    </swiper>
  </div>
</template>
<style scoped>
.section {
  margin-top: 5rem;
}
h2 {
  font-size: 2.4rem;
}
h3 {
  font-size: 1.6rem;
  color: var(--gray-50);
}
h2,
h3,
.container {
  margin-top: 1rem;
}
.container {
  padding: 1rem;
}
</style>
