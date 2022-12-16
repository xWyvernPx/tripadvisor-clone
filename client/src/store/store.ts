import { createStore } from "vuex";
import authModule from "./modules/auth";
import cartModule from "./modules/cart";
import modalState from "./modules/modal";

const store = createStore({
  modules: {
    auth: authModule,
    modal: modalState,
    cart: cartModule,
  },
});
export default store;
