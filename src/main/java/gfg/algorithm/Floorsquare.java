package gfg.algorithm;

import java.util.List;

public class Floorsquare {

    public static int floorsquareHelper(int i){
        if (i == 0 || i ==1){
            return i;
        }

        int low = 1;
        int end = i;
        int ans =0;

        while(low <= end){

            int mid = (low + end) /2;

            if (mid * mid == i){
                return mid;
            }
            if (mid * mid < i ){
                low = mid +1;
                ans = mid;
            }else{
                end = mid -1;
            }

        }


        return ans;
    }



    public static void  main(String[] args){
        System.out.println(floorsquareHelper(5));

    }

}
