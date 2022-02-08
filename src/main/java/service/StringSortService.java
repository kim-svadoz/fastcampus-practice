package service;

import java.util.List;
import logic.Sort;

public class StringSortService {

    private final Sort<String> sort;

    public StringSortService(Sort<String> sort) {
        this.sort = sort;
    }

    public List<String> doSort(List<String> input) {
        return sort.sort(input);
    }
}
