package gfg.recursion;

public class Sumofsubset {


        static void printSubsetSum(int[] arr, int n, int  sum){


            if(arr.length == n){
                System.out.println(sum);
                return;
            }


            printSubsetSum(arr, n+1, sum+arr[n]);
            printSubsetSum(arr, n+1, sum);


        }

    static void printSubset(int[] arr, int n, String  out){


        if(arr.length == n){
            System.out.println(out);
            return;
        }


        printSubset(arr, n+1, out + "" + arr[n]);
        printSubset(arr, n+1, out);


    }


    public static void main(String[] args) {
        int[] arr = {4, 6, 8};
        printSubset(arr, 0, "");
    }
}
