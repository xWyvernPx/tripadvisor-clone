import { Module } from "vuex";

export type ModalType = "SEARCH" | "LOGIN";

export interface ModalState {
  isShow: boolean;
  type: ModalType | null;
}
const state = () => ({
  isShow: false,
  type: null,
});
const modalState: Module<ModalState, any> = {
  state,
  mutations: {
    toggleModal: (state, payload: ModalType) => {
      state.isShow = !state.isShow;
      state.type = payload;
    },
  },
};

export default modalState;
