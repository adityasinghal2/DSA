package gfg.recursion;

public class Print1toN {


    public static void printHelper(int[] arr, int n){

        if (n == 1){
            return;
        }
        printHelper(arr, n-1);
        System.out.println(arr[n]);

    }
    public static void  main(String[] args){

        int[] arr = new int[]{1,2,3,4,5,6,7};
        printHelper(arr, arr.length-1);

    }


}
