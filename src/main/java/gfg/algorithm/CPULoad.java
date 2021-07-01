package gfg.algorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CPULoad {

    private static int maxCpuLoad(int[][] process) {
        Arrays.sort(process, (a, b) -> a[0]-b[0]);


        // list of intervals
//        List<int[]> li = new ArrayList<>();


        // variable to store the result
        int start = process[0][0];
        int end = process[0][1];
        int l =  process[0][2];
        int ans=0;

        // Merge intervals
        for(int[] p : process)
        {
            if(p[0] < end){
                ans = Math.max(p[2] + ans, ans);
                end = Math.max(end, p[1]);
            }
            else
            {
                start = p[0];
                end = p[1];
            }


        }
//        ans= Math.max(p[][2] + ans, ans);

        return ans;

    }



    // Driver Code
    public static void main(String[] args)
    {
        // Given Process
        int[][] process = new int[][] {{6, 7, 10}, {2, 4, 11}, {8, 12, 15}} ;

        // Function call
        int ans = maxCpuLoad(process);
        System.out.print(ans);
    }
}
