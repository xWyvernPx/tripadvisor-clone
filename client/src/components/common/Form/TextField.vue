<script setup lang="ts">
interface FieldProps {
  icon: any;
  name: string;
  placeholder?: string;
}
defineProps<FieldProps>();
</script>
<template>
  <div class="text-field">
    <component :is="icon"></component>
    <input type="text" :placeholder="placeholder" :name="name" />
  </div>
</template>
<style scoped>
.text-field {
  width: 100%;
  height: 4rem;
  display: flex;
  gap: 1rem;
  padding: 0.75rem 0.75rem;
  padding-left: 1.5rem;
  align-items: center;
  border-radius: var(--radiusFullRounded);
  border: 1px solid var(--gray-80);
}
.text-field input {
  width: 100%;
  height: 100%;
  font-size: 1.6rem;
}
.text-field svg {
  flex: 2rem 0 0;
  width: 20px;
  height: 20px;
}
</style>
