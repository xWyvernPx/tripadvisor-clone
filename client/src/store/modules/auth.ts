import _default, { Module } from "vuex";
import userApi from "../../api/userApi";
type User = {
  name: string;
  id: number;
};
export interface UserState {
  isLoggedIn: boolean;
  user: User | null | undefined;
}
const state = () => ({
  isLoggedIn: false,
  user: null,
});
const authModule: Module<UserState, any> = {
  state,
  actions: {
    login: async (store, payload) => {
      const user = await userApi.loginWithEmail(
        payload.email,
        payload.password
      );
      if (user) {
        store.commit("loginSucessfully");
      } else {
        store.commit("loginFailed");
      }
    },
  },
  mutations: {
    loginFailed: (state) => {
      state.isLoggedIn = false;
      state.user = null;
    },
    loginSucessfully: (state, user) => {
      state.isLoggedIn = true;
      state.user = {
        id: user.id,
        name: user.lastname + " " + user.firstname,
      };
    },
  },
};

export default authModule;
