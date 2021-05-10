package gfg.recursion;


import java.time.Duration;
import java.time.Instant;

public class CountOfSubsetsWithSum {


    public static void  main(String[] args){
        Instant start = Instant.now();
        int[] arr = new int[]{2, 3, 5, 6, 8, 10,2, 3, 5, 6, 8, 10,2, 3, 5, 6, 8, 10,2, 3, 5, 6, 8, 10,2, 3, 5, 6, 8, 10,2, 3, 5, 6, 8, 10,2, 3, 5, 6, 8, 10,2, 3, 5, 6, 8, 10,2, 3, 5, 6, 8, 10,2, 3, 5, 6, 8, 10,2, 3, 5, 6, 8, 10,2, 3, 5, 6, 8, 10,2, 3, 5, 6, 8, 10,2, 3, 5, 6, 8, 10,2, 3, 5, 6, 8, 10,2, 3, 5, 6, 8, 10,2, 3, 5, 6, 8, 10,2, 3, 5, 6, 8, 10,2, 3, 5, 6, 8, 10,2, 3, 5, 6, 8, 10};
        int n = arr.length;
        int k = 10;
        int[][] t = new int[n+1][k+1];



        for (int i = 0;i<= n;i++){
            t[i][0] = 1;
        }
        for (int j = 1;j<= k;j++){
            t[0][j] = 0;
        }

        for (int i =1;i<=n;i++){
            for (int j = 1;j<=k;j++){
                if (arr[i-1] <= j){
                    t[i][j] =  t[i-1][j - arr[i-1]] + t[i-1][j];
                }else {
                    t[i][j] = t[i-1][j];
                }
            }
        }
        System.out.println(t[n][k]);
        Instant end = Instant.now();
        Duration timeElapsed = Duration.between(start, end);
        System.out.println("Time taken: "+ timeElapsed.toMillis() +" milliseconds");
    }


}
