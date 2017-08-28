package algoritmo.sorting;

import algoritmo.model.QuickSort;
import algoritmo.util.StringUtil;


public class QuiSort {
    public static void main(String[] args) {
        long tempInicial = System.currentTimeMillis();              
        QuickSort qui = new QuickSort(args);
        qui.sortArray();
        StringUtil.printArray(qui.getSortingArray());    
        long tempFinal = System.currentTimeMillis();  
        long dif = (tempFinal - tempInicial); 
        String[] tempo = new String[3];
        tempo[0] = "Tempo de execucao: " + Long.toString(tempInicial) + " ms";
        tempo[1] = "Tempo de execucao: " + Long.toString(tempFinal) + " ms";
        tempo[2] = "Tempo de execucao: " + Long.toString(dif) + " ms";
        StringUtil.printArray(tempo);

    }

}