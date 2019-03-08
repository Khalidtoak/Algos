public class Algos {
    public static void main(String [] args) {

        int [] arrayToSort = {9, 45, 56, 78, 90, 23, 1, 12, 45, 34, 89, 0, 56, 89, 34, 56, 78, 23, 56, 34, 45, 67};
       // bubbleSortEg(arrayToSort);
        selecionSortEg(arrayToSort);
    }
    private static void bubbleSortEg(int [] arrayToSort){

        for (int lastUnSortedPartition = arrayToSort.length -1; lastUnSortedPartition
                 > 0; lastUnSortedPartition --){
            for (int i = 0; i<lastUnSortedPartition; i++){
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
    private static void selecionSortEg(int[] arrayToSort){
        for (int lastUnsortedPart = arrayToSort.length -1; lastUnsortedPart >0; lastUnsortedPart --){
            int largest =0;
            for (int i =1; i<=lastUnsortedPart; i++){
                if (arrayToSort[i]>arrayToSort[largest]){
                    largest = i;
                }
                swap(arrayToSort, largest, lastUnsortedPart );
            }
        }
        for (int anArrayToSort : arrayToSort) {
            System.out.println(anArrayToSort);
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
