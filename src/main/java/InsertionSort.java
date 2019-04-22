public class InsertionSort {

    private static void insertionSort(int []arrayToSort){
        for(int unsortedNo = 1; unsortedNo < arrayToSort.length; unsortedNo ++){
            int newElement = arrayToSort[unsortedNo];
            int i;
            for ( i = unsortedNo; i>0 && arrayToSort[i-1]>newElement; i--){
                arrayToSort[i] = arrayToSort[i-1];
            }
            arrayToSort[i] = newElement;
        }
        for (int anArrayToSort : arrayToSort) {
            System.out.println(anArrayToSort);
        }

    }
}
