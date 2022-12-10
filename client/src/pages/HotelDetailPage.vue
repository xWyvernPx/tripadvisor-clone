<script setup lang="ts">
import { BrowserIcon, HeartIcon, LocationIcon, MailIcon, PencilIcon, PhoneCallIcon, ShareIcon } from 'vue-tabler-icons';
import Rating from '../components/common/Rating/Rating.vue';

</script>
<template>
<div class="heading">
    <h2 class="name"></h2>
    <div class="judment-area">
        <div class="rating-review">
            <Rating :rating="4.8"></Rating>
            <span class="reviews"> 2055 reviews</span>
        </div>
        <div class="ranking"> #9 of hotels in Budapest</div>
    </div>
    <div class="info-area">
        <div class="information">
            <div class="address">
                <LocationIcon/>
                <router-link :to="'/#'">5 Hercegprimas Street, Budapest 1051 Hungary</router-link>
            </div>
            <div class="phone">
               <PhoneCallIcon/>
               <a href="tel:0909267385">0909267385</a>
            </div>
            <div class="website">
                <BrowserIcon/>
                <a href="https://source.unsplash.com/random">Visit hotel website</a>
            </div>
            <div class="email">
                <MailIcon/>
                <a href="mail:phonglethanh2@gmail.com">Email hotel</a>
            </div>
        </div>
        <div class="others-func">
            <span class="func">
                <PencilIcon/>
                <span>Review</span>
            </span>
            <span class="func">
                <HeartIcon/>
                <span>Save</span>
            </span>
            <span class="func">
                <ShareIcon/>
                <span>Share</span>
            </span>
        </div>
    </div>
</div>
</template>
<style>

</style>