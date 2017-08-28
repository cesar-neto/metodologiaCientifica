package algoritmo.sorting;

import algoritmo.model.SequentialMergeSort;
import algoritmo.util.StringUtil;

public class SeqSort {
	public static void main(String[] args) {		//sequential
		long tempInicial = System.currentTimeMillis();   
		SequentialMergeSort sms = new SequentialMergeSort(args);
		sms.sortArray();
		StringUtil.printArray(sms.getSortingArray());
		long tempFinal = System.currentTimeMillis();  
        long dif = (tempFinal - tempInicial); 
        String[] tempo = new String[3];
        tempo[0] = "Tempo de execucao: " + Long.toString(tempInicial) + " ms";
        tempo[1] = "Tempo de execucao: " + Long.toString(tempFinal) + " ms";
        tempo[2] = "Tempo de execucao: " + Long.toString(dif) + " ms";
        StringUtil.printArray(tempo);

	}


}
