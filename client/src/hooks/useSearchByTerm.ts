import { watch, ref } from "vue";
import { SearchByTermPayload, accomodationApi } from "../api/accomodationApi";
export type KindOfSearch = "ALL" | "HOTEL" | "RESTAURANT";

export type HookReturn = {
  listResult: any[];
};

export default ({ term, type }: HookProps): HookReturn => {
  const listResult = ref<any[]>([]);
  watch([type, term], async () => {
    const data = await accomodationApi.searchByTerm({
      term: term,
      type: type,
    });
    if (data) {
      listResult.value = data;
    }
  });
  return { listResult: listResult.value };
};
interface HookProps {
  type: KindOfSearch;
  term: string;
}
