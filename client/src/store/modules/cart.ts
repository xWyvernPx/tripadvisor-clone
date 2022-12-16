import { Module } from "vuex";

export interface CartState {
  isShowCart: boolean;
  items: any[];
}
const state: CartState = {
  isShowCart: false,
  items: [],
};
const cartModule: Module<CartState, any> = {
  state,
  actions: {},
  mutations: {
    toggleCart: (state) => {
      console.log(state);
      state.isShowCart = !state.isShowCart;
    },
  },
};

export default cartModule;
