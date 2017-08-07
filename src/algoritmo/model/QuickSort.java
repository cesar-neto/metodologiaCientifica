public class QuickSort {

    protected String[] sortingArray;

    public static void main(String[] args) {
        StringQuickSort sorter = new StringQuickSort();
        qui.sortArray();
        String words[] = {"zz", "aa", "cc", "hh", "bb", "ee", "ll"}; // the strings need to be sorted are put inside this array
        sorter.sort(words);

        for (String i : words) {
            System.out.print(i);
            System.out.print(" ");
        }
    }

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
        String pivot = this.names[lowerIndex + (higherIndex - lowerIndex) / 2];

        while (i <= j) {
            while (this.names[i].compareToIgnoreCase(pivot) < 0) {
                i++;
            }

            while (this.names[j].compareToIgnoreCase(pivot) > 0) {
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
        String temp = this.names[i];
        this.names[i] = this.names[j];
        this.names[j] = temp;
    }

    public void sortArray() {
        quickSort(0,sortingArray.length-1);
    }
    public String[] getSortingArray() {
        return sortingArray;
    }
}