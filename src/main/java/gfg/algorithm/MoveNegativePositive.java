package gfg.algorithm;

public class MoveNegativePositive {

    public static void moveNegativePositiveHelper(int[] arr, int n){

        int l = 0;
        int h = n-1;
        while(l <= h){

            if (arr[l] < 0){
                l++;
                continue;
            }
            if (arr[h] > 0){
                h--;
                continue;
            }
            int t = arr[l];
            arr[l] = arr[h];
            arr[h] = t;

            l++;
            h--;


        }


    }


    public static void main(String[] args){

        int[] arr = {-12, 11, -13, -5,
                6, -7, 5, -3, 11};
        int n = arr.length;

        moveNegativePositiveHelper(arr, n);

        for (int i =0; i<arr.length;i++){
            System.out.print(arr[i] + "||");
        }
    }
}
