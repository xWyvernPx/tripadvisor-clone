<script setup lang="ts">
    interface HeaderSearchProps {
        isShown : boolean
    }
    defineProps<HeaderSearchProps>();
</script>

<template >
    <div class="header-search" v-if="isShown">
      <div class="search-icon"></div>
      <div class="search-field">
        <input type="text" class="search-input" placeholder="Search">
      </div>
    </div>
</template>
<style scoped>
    .header-search {
        font-size: 1.5rem;
    }
</style>