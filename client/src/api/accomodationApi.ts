import { KindOfSearch } from "../hooks/useSearchByTerm";
import axiosClient from "./axiosClient";
export interface SearchByTermPayload {
  type: KindOfSearch;
  term: string;
  pagination?: any;
}
export const accomodationApi = {
  searchByTerm: async (payload: SearchByTermPayload) => {
    const url = "/search";
    const response = await axiosClient.get(url, {
      params: payload,
    });
    return response.data;
  },
};
