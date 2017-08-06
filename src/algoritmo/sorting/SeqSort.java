package algoritmo.sorting;

import algoritmo.model.SequentialMergeSort;
import algoritmo.util.StringUtil;

public class SeqSort {
	public static void main(String[] args) {		//sequential
		SequentialMergeSort sms = new SequentialMergeSort(args);
		sms.sortArray();
		StringUtil.printArray(sms.getSortingArray());

	}


}
