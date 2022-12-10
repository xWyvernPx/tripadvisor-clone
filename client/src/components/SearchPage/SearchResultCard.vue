<script setup lang="ts">
import Rating from '../common/Rating/Rating.vue';
import AccomodationTag from './AccomodationTag.vue';

// MOCK
</script>
<template>
    <div class="result-card" >
        <div class="thumbnail">
            <img src="https://source.unsplash.com/random" alt="">
            <AccomodationTag type="hotel"></AccomodationTag>
        </div>
        <div class="card-content">
            <div class="card-title">
                <span>Diving Agency</span>
            </div>  
            <div class="rating-area">
                <div class="">
                    <Rating :rating="1.2"></Rating>
                </div>
                <span class="reviews">1234 reviews</span>
            </div>
            <div class="address">
                Lorem ipsum dolor sit amet consectetur adipisicing elit. Esse, veniam.
            </div>
        </div>
    </div>
</template>
<style scoped> 
    .result-card {
        max-height: 17rem;
        height: 17rem;
        min-height: 17rem;
        padding : 1.6rem 2.4rem;

        display: flex;
        gap :  1.6rem;
        border-bottom: 1px solid var(--gray-80);
        cursor: pointer;
    }
    .thumbnail {
        height: 100%;
        aspect-ratio: 4/3;
        position: relative
    }
    img {
        width: 100%;
        height: 100%;
        object-fit: cover;
    }
    .card-title {
        font-size : 2rem;
    }
    .card-content {
        display: flex;
        gap: 1rem;
        flex-direction: column;
    }
    .rating-area {
        display: flex;
        gap : 1rem;
        color : var(--gray-30);
        font-size: 1rem;
    }
    .reviews{
        font-size: 1.4rem;
    }
    .address {
        font-size: 1.4rem;
        color : var(--gray-50)
        
    }
</style>