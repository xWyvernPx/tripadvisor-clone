import axiosClient from "./axiosClient";

const userApi = {
  loginWithEmail: async (username: string, password: string) => {
    const url = "/login";
    const reponse = await axiosClient.post(url, {
      username: username,
      password: password,
    });
    console.log(reponse);
    return reponse.data;
  },
};

export default userApi;
