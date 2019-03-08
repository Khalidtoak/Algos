public class Algos {
    public static void main(String [] args) {
        bubbleSortEg();
    }
    private static void bubbleSortEg(){
        int [] arrayToSort = {9, 45, 56, 78, 90, 23, 1, 12, 45, 34, 89, 0, 56, 89, 34, 56, 78, 23, 56, 34, 45, 67};
        for (int lastSortedPartition = arrayToSort.length -1; lastSortedPartition
                 > 0; lastSortedPartition --){
            for (int i = 0; i<lastSortedPartition; i++){
                if (arrayToSort[i]> arrayToSort[i+1]){
                    swap(arrayToSort, i, i+1);
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
    private static void swap(int [] arrayToSort, int i, int j){
        if (i == j){
            return;
        }
        int temp = arrayToSort[i];
        arrayToSort[i] = arrayToSort[j];
        arrayToSort[j] = temp;

    }
}
