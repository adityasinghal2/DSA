package gfg.recursion;

public class SortArray {


    public static void insertHelper(int[] arr, int n, int temp){

        if (n == 0 || arr[n-1] < temp){
            arr[n] = temp;
            return;
        }
        int i = arr[n-1];
        insertHelper(arr, n-1, temp);
        arr[n] = i;

    }

    public static void sortHelper(int[] arr, int n){

        if (n == 0){
            return;
        }
        int temp = arr[n];
        sortHelper(arr, n-1);
//        int j = n-1;
//        while(j >= 0 && arr[j] > temp){
//            arr[j+1] = arr[j];
//          j--;
//        }
//        arr[j+1] = temp;
        insertHelper(arr, n, temp);

    }

    public static void  main(String[] args){

        int[] arr = new int[]{5,2,1,7,4,10,0};
        sortHelper(arr, arr.length-1);
        for (int i= 0; i< arr.length; i++){
            System.out.println(arr[i]);
        }

    }

}
