package algoritmo.model;
public class QuickSort {

    protected String[] sortingArray;

    public QuickSort(String[] unsortedArray) {
        super();
        if (unsortedArray == null || unsortedArray.length == 0) {
            return;
        }
        this.sortingArray = unsortedArray;
        //quickSort(0, sortingArray.length - 1);
    }

    void quickSort(int lowerIndex, int higherIndex) {
        int i = lowerIndex;
        int j = higherIndex;
        String pivot = this.sortingArray[lowerIndex + (higherIndex - lowerIndex) / 2];

        while (i <= j) {
            while (this.sortingArray[i].compareToIgnoreCase(pivot) < 0) {
                i++;
            }

            while (this.sortingArray[j].compareToIgnoreCase(pivot) > 0) {
                j--;
            }

            if (i <= j) {
                exchangeNames(i, j);
                i++;
                j--;
            }
        }
        //call quickSort recursively
        if (lowerIndex < j) {
            quickSort(lowerIndex, j);
        }
        if (i < higherIndex) {
            quickSort(i, higherIndex);
        }
    }

    void exchangeNames(int i, int j) {
        String temp = this.sortingArray[i];
        this.sortingArray[i] = this.sortingArray[j];
        this.sortingArray[j] = temp;
    }

    public void sortArray() {
        quickSort(0,sortingArray.length-1);
    }
    public String[] getSortingArray() {
        return sortingArray;
    }
}