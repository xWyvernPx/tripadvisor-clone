<script setup lang="ts">
import { computed } from 'vue';
import {Home2Icon,ToolsKitchen2Icon} from 'vue-tabler-icons'
    type  TagType = "hotel"| "restaurant"
    interface Props {
        type : TagType
    }
    defineProps<Props>();
    const icon = {
        hotel : Home2Icon,
        restaurant : ToolsKitchen2Icon
    }
    const iconGetter = ((type: TagType)=>{
        return icon[type];
    })
    const nameGetter = ((type : TagType)=> type.toLocaleUpperCase())
</script>
<template>
<div class="tag">
    <component :is="iconGetter(type)"></component>
    <span>{{nameGetter(type)}}</span>
</div>
</template>

<style scoped>
.tag {
    display : flex;
    gap: 1rem;
    padding : 0.5rem 1rem;
    color : var(--white);
    background : linear-gradient(0deg,rgba(0,0,0,0.4), rgba(0,0,0,0));
    position: absolute;
    left: 0;
    right : 0;
    height: fit-content;
    bottom: 0;
    align-items: center;
}
svg {
    width: 1.8rem;
}
span{
    font-size: 1.2rem;
}
</style>