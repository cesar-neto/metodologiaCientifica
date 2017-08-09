package algoritmo.sorting;

import algoritmo.model.ParallelMergeSort;
import algoritmo.util.StringUtil;

/**
 * Class main parallel mergesort.
 */
public class ParSort {
	static int NPARALLELSORT = 5;
	public static void main(String[] args) throws Throwable {  //parallel
        ParallelMergeSort pms = new ParallelMergeSort(args, NPARALLELSORT);
        pms.sortArray();
        StringUtil.printArray(pms.getSortingArray());
    }



}
