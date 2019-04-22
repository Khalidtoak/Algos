public final class BubbleSort {
    private static void bubbleSortEg(int [] arrayToSort){

        for (int lastUnSortedPartition = arrayToSort.length -1; lastUnSortedPartition
                > 0; lastUnSortedPartition --){
            for (int i = 0; i<lastUnSortedPartition; i++){
                if (arrayToSort[i]> arrayToSort[i+1]){
                    Utils.swap(arrayToSort, i, i+1);
                }
            }
        }
        //ascending
        for (int i=0; i<arrayToSort.length; i++){
            System.out.println(arrayToSort[i]);
        }
        //descending
        for (int i = arrayToSort.length-1; i >=0; i--){
            System.out.print(arrayToSort[i] + " ");
        }
    }
}
