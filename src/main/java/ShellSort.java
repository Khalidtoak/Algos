public class ShellSort {
    //{2,34,12,25}
     static void shellSort(int [] arrayToSort){
        for (int gap = arrayToSort.length/2; gap >0; gap/=2){
            for (int i = gap; i< arrayToSort.length; i++){
                int newElement = arrayToSort[i];
                int j = i;
                while (j>=gap && arrayToSort[j-gap] >= newElement){
                    arrayToSort[j]=arrayToSort[j-gap];
                    j-=gap;
                }
                arrayToSort[j] =newElement;

            }
        }
        for (int anArrayToSort : arrayToSort) {
            System.out.println(anArrayToSort);
        }
    }
}
