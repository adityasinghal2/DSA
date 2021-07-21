package gfg.algorithm;

import java.util.*;
import java.util.LinkedList;

class GFG {
    /* Utility Functions to get max and minimum of two integers */
    int max(int x, int y)
    {
        return x > y ? x : y;
    }

    int min(int x, int y)
    {
        return x < y ? x : y;
    }

    /* For a given array arr[], returns the maximum j-i such that
       arr[j] > arr[i] */

    static int minv = Integer.MAX_VALUE;

    static int maxIndexDiffMap(ArrayList<Integer> arr, int n)
    {

        // Initilaise unordered_map
        Map<Integer, ArrayList<Integer>> hashmap = new HashMap<Integer,
                ArrayList<Integer>>();

        // Iterate from 0 to n - 1
        for(int i = 0; i < n; i++)
        {
            if(hashmap.containsKey(arr.get(i)))
            {
                hashmap.get(arr.get(i)).add(i);
            }
            else
            {
                hashmap.put(arr.get(i), new ArrayList<Integer>());
                hashmap.get(arr.get(i)).add(i);
            }
        }

        // Sort arr
        Collections.sort(arr);
        int maxDiff = Integer.MIN_VALUE;
        int temp = n;

        // Iterate from 0 to n - 1
        for(int i = 0; i < n; i++)
        {
            if (temp > hashmap.get(arr.get(i)).get(0))
            {
                temp = hashmap.get(arr.get(i)).get(0);
            }
            maxDiff = Math.max(maxDiff,
                    hashmap.get(arr.get(i)).get(
                            hashmap.get(arr.get(i)).size() - 1) - temp);
        }
        return maxDiff;
    }

    int maxIndexDiff(int arr[], int n)
    {
        int maxDiff;
        int i, j;

        int RMax[] = new int[n];
        int LMin[] = new int[n];

        /* Construct LMin[] such that LMin[i] stores the minimum value
           from (arr[0], arr[1], ... arr[i]) */
        LMin[0] = arr[0];
        for (i = 1; i < n; ++i)
            LMin[i] = min(arr[i], LMin[i - 1]);

        /* Construct RMax[] such that RMax[j] stores the maximum value
           from (arr[j], arr[j+1], ..arr[n-1]) */
        RMax[n - 1] = arr[n - 1];
        for (j = n - 2; j >= 0; --j)
            RMax[j] = max(arr[j], RMax[j + 1]);

        /* Traverse both arrays from left to right to find optimum j - i
           This process is similar to merge() of MergeSort */
        i = 0;
        j = 0;
        maxDiff = -1;
        while (j < n && i < n) {
            if (LMin[i] < RMax[j]) {
                maxDiff = max(maxDiff, j - i);
                j = j + 1;
            }
            else
                i = i + 1;
        }

        return maxDiff;
    }

    static void solvehelper(int  N, int  s, int o, int m){



        if(s > N || s<0){
            return ;
        }

        if(s == N){
            minv = Math.min(minv, m+o);
            return;
        }

        if(s+1<N) {
            solvehelper(N, s + 1, o + 1, m);
            solvehelper(N, s - 1, o, m + 1);
        }



    }


    static int greedy(int n, int k,int[] arr, int m){
        int count = 0;
        int nextRefill = k;
        int j =0;
        for(int i =1;i<=n;i++){



            if(nextRefill == i){
                count++;
                nextRefill+=k;
            }else if(j<m && i == arr[j] ){
                count++;
                nextRefill+=k;
                j++;
            }



        }

        return count;



    }

    static int solve(long N){
        // Write your code here

        solvehelper((int)N, 0, 0,0);

        return minv;

    }

    /* Driver program to test the above functions */
    public static void main(String[] args)
    {
//        GFG max = new GFG();
        int arr[] = { 6, 7, 8 } ;
//        int n = arr.length;
//        int maxDiff = max.maxIndexDiff(arr, n);
//        System.out.println(maxDiff);
//        int n = 9;
//        ArrayList<Integer> arr = new ArrayList<Integer>(
//                Arrays.asList(34, 8, 10, 3, 2, 80, 30, 33, 1));
//
//        // Function Call
//        int ans = maxIndexDiffMap(arr, n);
//
//        System.out.println("The maxIndexDiff is : " + ans);

        System.out.println(greedy(10,2,arr,3));
    }
}
