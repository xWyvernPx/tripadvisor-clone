<script setup lang="ts">
import {
  BrowserIcon,
  HeartIcon,
  LocationIcon,
  MailIcon,
  PencilIcon,
  PhoneCallIcon,
  ShareIcon,
} from "vue-tabler-icons";
import Rating from "../components/common/Rating/Rating.vue";
import { useRoute } from "vue-router";
import { watch, onBeforeMount } from "vue";
import PhotoGallery from "../components/HotelDetail/PhotoGallery.vue";
import BookingSection from "../components/HotelDetail/BookingSection.vue";
const route = useRoute();
const id = route.params.id as string;
onBeforeMount(() => {
  //TODO :  fetch
});
</script>
<template>
  <div class="heading">
    <h2 class="name">Aria Hotel Budapest by Library Hotel Collection</h2>
    <div class="judgement-area">
      <div class="rating-review">
        <Rating :rating="4.8"></Rating>
        <span class="reviews"> 2055 reviews</span>
      </div>
      <div class="ranking">#9 of hotels in Budapest</div>
    </div>
    <div class="info-area">
      <div class="information">
        <div class="address">
          <LocationIcon />
          <router-link :to="'/#'"
            >5 Hercegprimas Street, Budapest 1051 Hungary</router-link
          >
        </div>
        <div class="phone">
          <PhoneCallIcon />
          <a href="tel:0909267385">0909267385</a>
        </div>
        <div class="website">
          <BrowserIcon />
          <a href="https://source.unsplash.com/random">Visit hotel website</a>
        </div>
        <div class="email">
          <MailIcon />
          <a href="mail:phonglethanh2@gmail.com">Email hotel</a>
        </div>
      </div>
      <div class="others-func">
        <span class="func">
          <PencilIcon />
          <span>Review</span>
        </span>
        <span class="func save">
          <HeartIcon />
          <span>Save</span>
        </span>
        <span class="func">
          <ShareIcon />
          <span>Share</span>
        </span>
      </div>
    </div>
  </div>
  <div class="gallery">
    <PhotoGallery></PhotoGallery>
  </div>
  <BookingSection />
  <div class="about"></div>
</template>
<style scoped>
.name {
  font-size: 3.2rem;
  margin-bottom: 0.75rem;
}
.gallery {
  max-width: 75%;
  margin: 0 auto;
  margin-top: 3rem;
}
.judgement-area {
  display: flex;
  gap: 2rem;
  font-size: 1.4rem;
  color: var(--gray-30);
}

.rating-review {
  display: flex;
  gap: 1rem;
  font-size: 1.4rem;
  color: var(--gray-30);
  margin-bottom: 1rem;
}
.info-area {
  display: flex;
  justify-content: space-between;
}
.information {
  display: flex;
  gap: 2rem;
}
.information div {
  display: flex;
  align-items: center;
  font-size: 1.4rem;
  gap: 1rem;
}
.others-func {
  display: flex;
  gap: 1.25rem;
}

.func {
  font-size: 1.4rem;
  display: flex;
  align-items: center;
  gap: 0.5rem;
  cursor: pointer;
}
.save:hover svg {
  fill: var(--primary-danger-dark-mode);
  color: var(--primary-danger-dark-mode);
}
a:hover {
  text-decoration: underline;
}
</style>
