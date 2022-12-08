<template>
  <teleport to="body">
    <div class="loader-wrapper">
      <div class="dashed-loading"></div>
      <div class="loading-backdrop"></div>
    </div>
  </teleport>
</template>
<style scoped>
.loader-wrapper {
  position: absolute;
  inset: 0;

  z-index: var(--loadingIndex);
}
.loading-backdrop {
  z-index: calc(var(--loadingIndex) + 1);
  position: absolute;
  inset: 0;
  background-color: var(--white);
  opacity: 0.7;
}
.dashed-loading {
  position: relative;
  height: 50px;
  z-index: calc(var(--loadingIndex) + 2);
  position: fixed;
  top: 50vh;
  left: 50%;
  transform: translate(-50%, -50%);
}

.dashed-loading:after,
.dashed-loading:before {
  content: "";
  position: absolute;
  top: 0;
  left: 0;
  border-radius: 50%;
  width: 50px;
  height: 50px;
}

.dashed-loading:before {
  z-index: 5;
  border: 3px dashed #ff6bcb;
  border-left: 3px solid transparent;
  border-bottom: 3px solid transparent;
  -webkit-animation: dashed 1s linear infinite;
  animation: dashed 1s linear infinite;
}

.dashed-loading:after {
  z-index: 10;
  border: 3px solid #ffb86c;
  border-left: 3px solid transparent;
  border-bottom: 3px solid transparent;
  -webkit-animation: dashed 1s ease infinite;
  animation: dashed 1s ease infinite;
}

@keyframes dashed {
  to {
    transform: rotate(360deg);
  }
}
</style>
