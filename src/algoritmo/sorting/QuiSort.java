package algoritmo.sorting;

import algoritmo.model.QuickSort;
import algoritmo.util.StringUtil;

public class QuiSort {
    public static void main(String[] args) {
        QuiSort qui = new QuiSort(args);
        qui.sortArray();
        StringUtil.printArray(qui.getSortingArray());

    }

}