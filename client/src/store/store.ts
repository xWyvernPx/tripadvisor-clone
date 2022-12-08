import { createStore } from "vuex";
import authModule from "./modules/auth";
import modalState from "./modules/modal";

const store = createStore({
  modules: {
    auth: authModule,
    modal: modalState,
  },
});
export default store;
