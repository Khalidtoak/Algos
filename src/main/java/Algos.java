public class Algos {
    public static void main(String [] args) {

        int [] arrayToSort = {9, 45, 56, 78, 90, 23, 1, 12, 45, 34, 89, 0, 56, 89, 34, 56, 78, 23, 56, 34, 45, 67};
        QuickSort.quickSort(0, arrayToSort.length,  arrayToSort);
        for (int anArrayToSort : arrayToSort) {
            System.out.println(anArrayToSort);
        }

    }





}
