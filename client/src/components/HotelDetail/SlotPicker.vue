<script setup lang="ts">
import { ref } from "vue";
import { BedIcon, FriendsIcon, UsersIcon, XIcon } from "vue-tabler-icons";
import NumberInputField from "../common/Form/NumberInputField.vue";
import { SlotInformation } from "./BookingSection.vue";
interface Props {
  slotInfo: SlotInformation;
}
const { slotInfo } = defineProps<Props>();
defineEmits([
  "increaseRoom",
  "decreaseRoom",
  "increaseAdults",
  "decreaseAdults",
  "decreaseChildren",
  "increaseChildren",
  "closePicker",
]);
</script>
<template>
  <div class="slot-picker">
    <div class="close">
      <button @click="$emit('closePicker')">
        <XIcon />
      </button>
    </div>
    <div class="field">
      <label for="">
        <BedIcon />
        <span>Room</span>
      </label>
      <NumberInputField
        :value="slotInfo.room"
        :min="1"
        :max="10"
        @decrease-handle="$emit('decreaseRoom')"
        @increase-handle="$emit('increaseRoom')"
      />
    </div>
    <div class="field">
      <label for="">
        <UsersIcon />
        <span>Adults</span>
      </label>
      <NumberInputField
        :value="slotInfo.adults"
        :min="1"
        :max="20"
        @decrease-handle="$emit('decreaseAdults')"
        @increase-handle="$emit('increaseAdults')"
      />
    </div>
    <div class="field">
      <label for="">
        <FriendsIcon />
        <span>Children</span>
      </label>
      <NumberInputField
        :value="slotInfo.children"
        :min="1"
        :max="10"
        @decrease-handle="$emit('decreaseChildren')"
        @increase-handle="$emit('increaseChildren')"
      />
    </div>
  </div>
</template>
<style scoped>
.field {
  display: flex;
  width: 100%;
  justify-content: space-between;
  margin: 1rem 0;
}
span {
  line-height: 1.5;
}
.field label {
  display: flex;
  align-items: center;
}
.close {
  width: 100%;
  display: flex;
  justify-content: flex-end;
}
.slot-picker {
  position: absolute;
  right: 0;
  top: 0;
  padding: 0.75rem;
  transform: translate(105%, -40%);
  width: 25rem;
  background-color: var(--white);
  /* border: 1px solid var(--black); */
  box-shadow: 0px 0px 10px -5px var(--black);
}
.slot-picker svg {
  scale: 0.75;
  /* position: absolute; */
}
.slot-picker::after {
  content: "";
  left: 0;
  top: 50%;
  width: 15px;
  height: 15px;
  background-color: var(--white);
  transform: rotateZ(45deg) translate(-110%, -50%);
  position: absolute;
}
</style>
