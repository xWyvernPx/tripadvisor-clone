<script setup lang="ts">
import PrimarySolidButton from '../common/Button/PrimarySolidButton.vue';
import SearchResultCard from './SearchResultCard.vue';
interface Props  {
    listResult? : any[],
}
defineProps<Props>();
</script>
<template>
    <div class="list-card">
        <search-result-card/>
        <search-result-card/>
        <search-result-card/>
        <div class="button-wrapper">

            <PrimarySolidButton>More results</PrimarySolidButton>
        </div>
    </div>

</template>
<style scoped>
.button-wrapper {
    width: 15rem;
    margin: 1rem auto;
    
}
.list-card {
    margin-top : 2rem;
    display: flex;
    gap : 2rem;
    flex-direction: column;
    border : 1px solid var(--gray-80)
}
</style>