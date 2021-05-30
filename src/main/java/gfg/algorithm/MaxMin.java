package gfg.algorithm;

import java.util.ArrayList;

public class MaxMin {


    public static void maxMin(int[] arr){

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (int a: arr){
            if (a > max) {
                max = a;
            }else if (a < min){
                min = a;
            }

        }

        System.out.println(min);
        System.out.println(max);

    }

    static ArrayList<Integer> subarraySum(int[] arr, int n, int s)
    {
        // Your code here
        ArrayList<Integer> ans = new ArrayList<Integer>();
        int i =0;
        int j = 0;
        int sum = 0;
        while(j < n){

            sum+=arr[j];

            if (sum > s){
                while(sum > s){
                    sum-=arr[i];
                    i++;
                }

            }


            if (sum == s ){
                break;
            }

            j++;


        }

        if (j == n){
            ans.add(-1);
            return ans;
        }
        ans.add(i+1);
        ans.add(j+1);
        return ans;




    }


    public static void main(String[] args){

        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        ArrayList<Integer> ans  = subarraySum(arr, arr.length, 40);

        System.out.println(ans.get(0));
        System.out.println(ans.get(1));

//        maxMin(arr);

    }
}
