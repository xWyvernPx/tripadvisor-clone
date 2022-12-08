import { Component } from "vue";
import { RouteLocation, RouteRecordRaw } from "vue-router";
// import HomePage from "../pages/HomePage.vue";

const SearchByTermPage = () => import("../pages/SearchByTermPage.vue");
const HomePage = () => import("../pages/HomePage.vue");

const routes: RouteRecordRaw[] = [
  {
    path: "/",
    component: HomePage,
  },
  {
    path: "/search",
    component: SearchByTermPage,
    props: (route) => ({ q: route.query.q }),
  },
];
export default routes;
