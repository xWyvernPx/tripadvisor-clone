<script setup lang="ts">
import PrimarySolidBlackButton from "../../Button/PrimarySolidBlackButton.vue";
defineEmits(["GoBack", "Register"]);
</script>
<template>
  <div>
    <div class="img">
      <img src="/icon.webp" alt="" />
    </div>
    <h1>Welcome back.</h1>
    <form>
      <div class="inline">
        <label for="">First Name</label>
        <input type="text" name="firstname" placeholder="First Name" />
      </div>
      <div class="inline">
        <label for="">Lastname</label>
        <input type="text" name="lastname" placeholder="Lastname" />
      </div>
      <label for="">Email Address</label>
      <input type="text" name="email" placeholder="Email" />
      <label for="">Password</label>
      <input type="password" name="password" placeholder="Password" />
      <a href="">Forget password ?</a>
      <div class="button-wrapper">
        <PrimarySolidBlackButton>Sign up</PrimarySolidBlackButton>
      </div>
      <div class="not-member">
        <span class="">Not a member ?</span>
        <div class="strike"></div>
      </div>
      <span
        ><a href="#" @click.prevent="$emit('Register')">Join</a> to unlock the
        best of Tripadvisor</span
      >
    </form>
  </div>
</template>
<style scoped>
div.inline {
  display: inline;
  widows: 45%;
}
.img {
  width: 4.8rem;
  aspect-ratio: 1;
  margin-bottom: 2rem;
}
img {
  width: 100%;
  height: 100%;
  object-fit: cover;
}
h1 {
  margin-bottom: 4rem;
  font-size: 2.8rem;
}
label,
input {
  display: block;
  font-size: 1.4rem;
  margin-bottom: 1rem;
}
label {
}
input {
  margin-bottom: 1.5rem;
  padding: 1.25rem 1rem;
  border-radius: var(--radiusSmall);
  border: 2px solid var(--gray-80);
  width: 100%;
  line-height: 1.5;
  margin-left: none;
  font-family: "Trip Sans";
}
a {
  font-size: 1.6rem;
  text-decoration: underline;
  margin-bottom: 1rem;
  color: var(--black);
}
button {
  margin-top: 4rem;
  margin-bottom: 2rem;
  padding-top: 1.25rem;
  padding-bottom: 1.25rem;
}
.button-wrapper {
  width: 25rem;
  margin: 0 auto;
}
span {
  display: block;
  width: fit-content;
}
.not-member,
span {
  font-size: 1.6rem;
  margin: 0 auto;
  padding: 1rem;
  background-color: var(--white);
  position: relative;
  z-index: calc(var(--modalZIndex) + 3);
}
.not-member::after {
  content: "";
  position: absolute;
  left: 10%;
  right: 10%;
  height: 1px;
  top: 50%;
  z-index: calc(var(--modalZIndex) + 2);

  background-color: var(--gray-80);
}
</style>
