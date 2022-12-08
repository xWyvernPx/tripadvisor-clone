import { Axios } from "axios";
const baseURL = "http://localhost:5000/api/v1";
const axiosClient = new Axios({
  baseURL,
  headers: {
    "Content-Type": "application/json",
  },
  withCredentials: true,
});

export default axiosClient;
