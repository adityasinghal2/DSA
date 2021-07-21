package gfg.algorithm;

import java.util.ArrayList;

class Stock {
    //Function to find the days of buying and selling stock for max profit.
    static ArrayList<ArrayList<Integer>> stockBuySell(int A[], int n) {
        // code here
        ArrayList<ArrayList<Integer>> ans = new ArrayList<ArrayList<Integer>>();

        for (int i = 0; i < n - 1;) {

            while(i<n-1 && A[i]>=A[i+1]){
                i++;
            }



            if(i == n-1){
                break;
            }

            int start = i;

            while (i<n-1 && A[i]<=A[i+1]){
                i++;
            }

            int end = i;

            ArrayList<Integer> ansd = new ArrayList<>();

          ansd.add(start);
            ansd.add(end);
            ans.add(ansd);


        }

        return ans;
    }

    public static void main(String[] args) {
        int a[] = {100,180,260,310,40,535,695};
        stockBuySell(a, a.length);
    }
}


