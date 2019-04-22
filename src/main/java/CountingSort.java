public class CountingSort {
    public static void countingSort(int min, int max, int [] input){
        int [] countArray = new int[(max -min) +1];
        for (int i = 0; i< input.length; i++){
           countArray[input[i] - min]++;
        }
        int j = 0;
        for (int i = 0; i<=max; i++){
            while (countArray[i-min]>0){
                input[j++] = i;
                countArray[i-min]--;
            }
        }
    }
}
