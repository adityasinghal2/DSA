package gfg.recursion;

import java.util.Scanner;


    /*
     * Enter your code here. Read input from STDIN. Print your output to STDOUT.
     * Your class should be named CandidateCode.
     */
    public class Contest {
        public static void main(String args[] ) throws Exception {

            //Write code here
            Scanner s = new Scanner(System.in);
            int t = Integer.parseInt(s.nextLine());

            while(t > 0){
                int[] arr = new int[26];
                String in = s.nextLine();
                for (int i = 0;i< in.length();i++){
                    arr[in.charAt(i) - 'a' ]+=1;
                }
                char ch = '\0' ;
                int min = Integer.MIN_VALUE;

                for (int i = 0;i< 26;i++){
                    if (arr[i] > min){
                        min = arr[i];
                        ch =  (char)('a' + i);
                    }
                }
                System.out.println(ch);


                t--;
            }

//            2
//            gqtrawq
//                    fnaxtyyzz


        }


}
