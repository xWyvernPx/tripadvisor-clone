<script setup lang="ts">
import { ref } from "vue";
import { UsersIcon } from "vue-tabler-icons";
import PrimarySolidButton from "../common/Button/PrimarySolidButton.vue";
import SlotPicker from "./SlotPicker.vue";
export interface SlotInformation {
  room: number;
  adults: number;
  children: number;
}
const slotInformation = ref<SlotInformation>({
  room: 1,
  adults: 2,
  children: 0,
});
const isShowPicker = ref(false);
const togglePicker = () => {
  isShowPicker.value = !isShowPicker.value;
  console.log(isShowPicker);
};

const increaseAdults = () => {
  const MAX_ADULTS_PER_ROOM = 4;
  const adultsIncreased = slotInformation.value.adults + 1;
  slotInformation.value.adults++;
  if (
    Math.ceil(adultsIncreased / MAX_ADULTS_PER_ROOM) >
    slotInformation.value.room
  ) {
    slotInformation.value.room++;
  }
};
const increaseChildren = () => {
  const MAX_CHILDREN_PER_ROOM = 8;
  const childrenIncreased = slotInformation.value.children + 1;
  if (
    Math.ceil(childrenIncreased / MAX_CHILDREN_PER_ROOM) >
    slotInformation.value.room
  ) {
    slotInformation.value.room++;
  }
  slotInformation.value.children++;
};
</script>
<template>
  <div class="booking">
    <div class="picker">
      <span>Lowest prices for your stay</span>
      <div class="datepicker">
        <input type="date" name="from" id="" />

        <input type="date" name="to" id="" />
      </div>
      <div class="relative">
        <button class="slot" @click="togglePicker">
          <UsersIcon />
          <div class="slot-info">
            <span>Guests</span>
            <span>{{
              `${slotInformation.room} room${
                slotInformation.room > 1 ? "s" : ""
              }, ${slotInformation.adults} adult${
                slotInformation.adults > 1 ? "s" : ""
              }, ${slotInformation.children} ${
                slotInformation.children > 1 ? "children" : "child"
              }`
            }}</span>
          </div>
        </button>
        <SlotPicker
          v-if="isShowPicker"
          :slot-info="slotInformation"
          @increase-room="() => slotInformation.room++"
          @decrease-room="() => slotInformation.room--"
          @increase-adults="increaseAdults"
          @decrease-adults="() => slotInformation.adults--"
          @increase-children="increaseChildren"
          @decrease-children="() => slotInformation.children--"
          @close-picker="() => (isShowPicker = false)"
        />
      </div>
      <PrimarySolidButton class="search-button">Search</PrimarySolidButton>
    </div>
    <div class="available-room">Available room</div>
  </div>
</template>
<style scoped>
.booking {
  border: 2px solid var(--gray-80);
  border-radius: var(--radiusSmall);
  display: flex;
  padding: 2rem 1rem;
}
.relative {
  width: 100%;
  position: relative;
}
.picker {
  display: flex;
  flex-direction: column;
  /* border-right: 2px solid var(--gray-80); */
  margin-right: 1rem;
}
.picker span {
  font-size: 1.4rem;
  text-align: center;
}
.datepicker {
  margin-top: 1rem;
}
input {
  border: 1px solid var(--gray-80);
  padding: 0.75rem;
  margin-right: 1rem;
  border-radius: var(--radiusSmall);
}
input[name="from"] {
  border-left: 4px solid var(--green-30);
}
input[name="from"]:focus {
  border-color: var(--green-30);
}
input[name="to"] {
  border-left: 4px solid var(--primary-danger);
  margin-right: 0rem;
}
input[name="to"]:focus {
  border-color: var(--primary-danger);
}

.slot:focus {
  border-color: var(--black);
}
.slot {
  margin-top: 1rem;
  display: flex;
  border: 1px solid var(--gray-80);
  padding: 0.75rem;
  gap: 1rem;
  border-radius: var(--radiusSmall);
  position: relative;
  width: 100%;
}
svg {
  stroke-width: 1px;
  scale: 0.9;
}
.slot-info {
  display: flex;
  flex-direction: column;
  align-items: flex-start;
}
.slot-info span:first-child {
  font-size: 1.2rem;
}
.slot-info span:nth-child(2) {
  font-size: 1.3rem;
}
.search-button {
  margin-top: 1rem;
}
</style>
