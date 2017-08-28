package algoritmo.sorting;

import algoritmo.model.ParallelMergeSort;
import algoritmo.util.StringUtil;

public class ParSort {
	static int NPARALLELSORT = 5;
	public static void main(String[] args) throws Throwable {  //parallel
		long tempInicial = System.currentTimeMillis();  
        ParallelMergeSort pms = new ParallelMergeSort(args, NPARALLELSORT);
        pms.sortArray();
        StringUtil.printArray(pms.getSortingArray());
        long tempFinal = System.currentTimeMillis();  
        long dif = (tempFinal - tempInicial); 
        String[] tempo = new String[3];
        tempo[0] = "Tempo de execucao: " + Long.toString(tempInicial) + " ms";
        tempo[1] = "Tempo de execucao: " + Long.toString(tempFinal) + " ms";
        tempo[2] = "Tempo de execucao: " + Long.toString(dif) + " ms";
        StringUtil.printArray(tempo);
    }



}
