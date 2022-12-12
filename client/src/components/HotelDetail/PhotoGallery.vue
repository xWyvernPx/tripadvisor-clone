<script setup lang="ts">

const imageList = [
    {url : "https://dynamic-media-cdn.tripadvisor.com/media/photo-o/08/b1/b4/fb/aria-hotel-budapest.jpg?w=1200&h=-1&s=1"},
    {url : "https://dynamic-media-cdn.tripadvisor.com/media/photo-o/08/94/56/de/aria-hotel-budapest.jpg?w=2000&h=-1&s=1"},
    {url : "https://dynamic-media-cdn.tripadvisor.com/media/photo-o/08/94/56/fd/aria-hotel-budapest.jpg?w=2000&h=-1&s=1"},
    {url : "https://dynamic-media-cdn.tripadvisor.com/media/photo-o/08/94/6c/86/aria-hotel-budapest.jpg?w=2000&h=-1&s=1"},
    {url : "https://dynamic-media-cdn.tripadvisor.com/media/photo-o/22/69/19/ca/perfect-duet-of-luxury.jpg?w=1400&h=-1&s=1"},
    {url : "https://dynamic-media-cdn.tripadvisor.com/media/photo-o/0a/4d/79/53/breakfast.jpg?w=2400&h=-1&s=1"},
    {url : "https://dynamic-media-cdn.tripadvisor.com/media/photo-o/11/d4/d5/ab/aria-hotel-budapest-by.jpg?w=2000&h=-1&s=1"},
    {url : "https://dynamic-media-cdn.tripadvisor.com/media/photo-o/08/96/65/06/aria-hotel-budapest.jpg?w=2000&h=-1&s=1"},
    {url : "https://dynamic-media-cdn.tripadvisor.com/media/photo-o/07/f5/93/b2/aria-hotel-budapest.jpg?w=2000&h=-1&s=1"},
    {url : "https://dynamic-media-cdn.tripadvisor.com/media/photo-o/11/9a/9a/f4/festive-season.jpg?w=900&h=-1&s=1"},
    {url : "https://dynamic-media-cdn.tripadvisor.com/media/photo-o/07/e9/33/a9/aria-hotel-budapest.jpg?w=2000&h=-1&s=1"},
    {url : "https://dynamic-media-cdn.tripadvisor.com/media/photo-o/0f/38/db/2c/aria-hotel-budapest-by.jpg?w=2000&h=-1&s=1"},
    {url : ""},
    {url : ""},
    {url : "https://source.unsplash.com/random"},
    {url : "https://source.unsplash.com/random"},
    {url : "https://source.unsplash.com/random"},
    {url : "https://source.unsplash.com/random"},
    {url : "https://source.unsplash.com/random"},
    {url : "https://source.unsplash.com/random"},
    {url : "https://source.unsplash.com/random"},
    {url : "https://source.unsplash.com/random"},
    {url : "https://source.unsplash.com/random"},
    {url : "https://source.unsplash.com/random"},
    {url : "https://source.unsplash.com/random"},
    {url : "https://source.unsplash.com/random"},
    {url : "https://source.unsplash.com/random"},
]

    </script>
<template>
<div class="wrapper">
    <div class="main">
        <img src="https://source.unsplash.com/random" alt="">
        <button class="swiper-button-next"></button>
        <button class="swiper-button-prev"></button>
    </div>
    <div class="list">
        <div class="queue-img" v-for="image in imageList">
            <img :src="image.url" alt="">
        </div>

    </div>
</div>
</template>

<style scoped>
    .wrapper {
        
        aspect-ratio: 8/5;
        display: grid;
        grid-template-columns: 76% 24%;
        grid-template-rows: 67% 33%;
        grid-template-areas: "main others" "list others";
        
    }
    .main {
        grid-area: main;
        width: 100%;
        height : 100%;
        position: relative;
    }
    .main img {
        width: 100%;
        height: 100%;
        object-fit: cover;
    }
    .list {
        margin-top:2px;
        grid-area: list;

        display : grid;
    
            --columns: 10;
            --gap: 2px;
            display: grid;
            grid-template-columns: repeat(var(--columns), minmax(0, 10%));
            grid-gap: var(--gap);
            grid-template-rows: repeat(2,min-content);
            place-items: center;
        }
    .queue-img {
        width:100%;
        aspect-ratio: 6/5;
        position: relative;;
        cursor:  pointer;;
    }
    .queue-img img {
        width: 100%;
        height: 100%;
        object-fit: cover;
    }
    .queue-img::after {
        content: "";
        inset:0;
        background-color: rgba(0,0,0,0.6);
        position: absolute;
        
    }
    .queue-img.active::after{
        background-color: transparent;
    }
    .queue-img:hover::after{
        background-color: transparent;
    }
    .swiper-button-prev,.swiper-button-next {
        position:absolute;
        top:50%;
    }
    .swiper-button-next{
        right : 0;
        transform: translate(0,-50%);
    }
    .swiper-button-prev{
        left:0;
        transform: translate(0,-50%);
    }
</style>