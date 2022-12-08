<script setup lang="ts">
import { ref } from 'vue';
import {TypeCardProps} from "./TypeCard.vue"
import TypeCard from "./TypeCard.vue"
import {BedIcon, Home2Icon, PlaneTiltIcon, ToolsKitchen2Icon} from "vue-tabler-icons"

const accomodationTypes= ref<TypeCardProps[]>([
    {
        name: "Hotels",
        icon: BedIcon,
    },
    {
        name: "Vacations Rental",
        icon: Home2Icon,
    },
    {
        name: "Restaurants",
        icon: ToolsKitchen2Icon,
    },
    {
        name: "Flights",
        icon: PlaneTiltIcon,
    }
])

</script>
<template>
    <div class="type-list">
        <type-card v-for="type in accomodationTypes" :name="type.name" :icon="type.icon"/>
    </div>
</template>
<style scoped>
.type-list {
    max-width: 100%;
    width: var(--maxPageWidth);
    margin-left: auto;
    margin-right: auto;
    display: flex;
    gap: 1rem;
}
</style>