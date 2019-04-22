public class SelectionSort {
    private static void selecionSortEg(int[] arrayToSort){
        for (int lastUnsortedPart = arrayToSort.length -1; lastUnsortedPart >0; lastUnsortedPart --){
            int largest =0;
            for (int i =1; i<=lastUnsortedPart; i++){
                if (arrayToSort[i]>arrayToSort[largest]){
                    largest = i;
                }
                Utils.swap(arrayToSort, largest, lastUnsortedPart );
            }
        }
        for (int anArrayToSort : arrayToSort) {
            System.out.println(anArrayToSort);
        }
    }
}
