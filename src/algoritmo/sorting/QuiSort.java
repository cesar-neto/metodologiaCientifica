package algoritmo.sorting;

import algoritmo.model.QuickSort;
import algoritmo.util.StringUtil;

public class QuiSort {
    public static void main(String[] args) {
        QuickSort qui = new QuickSort(args);
        qui.sortArray();
        StringUtil.printArray(qui.getSortingArray());

    }

}