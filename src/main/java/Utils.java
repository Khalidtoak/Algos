public class Utils {
     static void swap(int [] arrayToSort, int i, int j){
        if (i == j){
            return;
        }
        int temp = arrayToSort[i];
        arrayToSort[i] = arrayToSort[j];
        arrayToSort[j] = temp;

    }
    static int iterativeFactorial(int num){
        if(num == 0){
            return 1;
        }
        int factorial = 1;
        for (int i = 1; i<=num; i ++){
            factorial *=i;
        }
        return factorial;
    }
    static  int recuriveFactorial(int num){
        if (num == 0){
            return 1;
        }
        return num * recuriveFactorial(num - 1);
    }
}
