<script setup lang="ts">
import { computed } from "vue";
import { MinusIcon, PlusIcon } from "vue-tabler-icons";

interface Props {
  min: number | 0;
  max: number | 1;
  value?: number | 0;
}
const { value, max, min } = defineProps<Props>();
defineEmits(["increaseHandle", "decreaseHandle", "input"]);
</script>
<template>
  <div class="wrapper">
    <button
      class="decrease"
      :disabled="value === min"
      @click="$emit('decreaseHandle')"
    >
      <MinusIcon />
    </button>
    <input type="number" :value="value" />
    <button
      class="increase"
      :disabled="value === max"
      @click="$emit('increaseHandle')"
    >
      <PlusIcon />
    </button>
  </div>
</template>
<style scoped>
.wrapper {
  width: fit-content;
  height: fit-content;
  display: flex;
}
.wrapper input {
  width: 5rem;
  padding: 0.5rem;
  text-align: center;
  border-bottom: 1px solid var(--gray-80);
  border-top: 1px solid var(--gray-80);
}
button {
  display: grid;
  place-items: center;
  padding: 0.5rem;
  border: 1px solid var(--gray-80);
}
button:focus {
  border-color: var(--black);
}
button:disabled {
  color: var(--gray-80);
}
.decrease {
  border-right: 1px solid var(--gray-80);
}
.increase {
  border-left: 1px solid var(--gray-80);
}
</style>
