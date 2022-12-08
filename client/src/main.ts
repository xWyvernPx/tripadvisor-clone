import { createApp } from "vue";
import "./style.css";
import App from "./App.vue";
import { createRouter, createWebHashHistory } from "vue-router";
import routes from "./utils/routes";
import store from "./store/store";
const router = createRouter({
  routes,
  history: createWebHashHistory(),
});

createApp(App).use(store).use(router).mount("#app");
