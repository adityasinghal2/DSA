package gfg.algorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

class Solution
{
    public static ArrayList<Integer> countEleLessThanOrEqual(int arr1[], int arr2[], int m, int n)
    {

        int[] ar3 = new int[m];
        // add your code here
        for (int i = 0;i<m;i++){
            ar3[i] = arr1[i];
        }
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        Map<Integer,Integer> map = new HashMap<>();
        ArrayList<Integer> ans = new ArrayList<>();
        int lcount = 0;
        int i = 0;
        int j = 0;
        while(i < m && j < n){

            if (arr1[i] >= arr2[j]){
                lcount++;
                j++;
            }else{
                map.put(arr1[i],lcount);
                i++;
            }



        }


        while(i < m){
            map.put(arr1[i],lcount);
            i++;
        }


        for(int k = 0;k<m;k++){
            ans.add(map.get(ar3[k]));
        }

        return ans;

    }

    public static void main(String[] args) {
        int arr1[] = {1,2,3,4,7,9};
        int arr2[] = {0,1,2,1,1,4};
        countEleLessThanOrEqual(arr1, arr2, arr1.length,arr2.length);
    }
}
