class QuickSort {
    static void quickSort(int start, int end, int[] array){
        if ((end - start) < 2){
            return;
        }
        int pivot = partition(end, start, array);
        quickSort(start, pivot, array);
        quickSort(pivot+1, end, array);
    }

    private static int partition(int end, int start, int[] array) {
        int pivot = array[start];
        int i = start;
        int j = end;
        while (i<j){
            //Empty loop body
            while (i<j && array[--j] >= pivot);
            if (i<j)
                array[i] = array[j];

            while (i<j && array[++i] <= pivot);
            if (i<j)
                array[j] = array[i];
        }
        array[j] = pivot;
        return j;
    }
}
