//package gfg.recursion;
//
//
//// A Java program using recursive to count numbers
//// with sum of digits as given 'sum'
//
//
//class Countndigit
//{
//
////    static int lookup[][] = new int[101][501];
//    // Recursive function to count 'n' digit numbers
//
//    // with sum of digits as 'sum'. This function
//
//    // considers leading 0's also as digits, that is
//
//    // why not directly called
//
////    static int countRec(int n, int sum)
////
////
////
////    }
//
//
//
//    // This is mainly a wrapper over countRec. It
//
//    // explicitly handles leading digit and calls
//
//    // countRec() for remaining digits.
//
//
//
//    static void finalCount(String result, int n, int sum)
//
//    {
//
////        for(int i = 0; i <= 100; ++i){
////
////            for(int j = 0; j <= 500; ++j){
////
////                lookup[i][j] = -1;
////
////            }
////
////        }
//        // Initialize final answer
//
//
//
//
//        if(n == 0 && sum == 0){
//            System.out.print(result + " ");
//            ans++;
//        }else if (n > 0 && sum >= 0){
//
//            char d = '0';
//            if (result.equals("")) {    // special case: number cannot start from 0
//                d = '1';
//            }
//
//            while (d <= '9')
//            {
//                finalCount(result + d, n - 1, sum - (d - '0'));
//                d++;
//            }
//
//        }
//
//
//
//
//        // Traverse through every digit from 1 to
//
//        // 9 and count numbers beginning with it
//
//
//
//    }
//
//
//    /* Driver program to test above function */
//
//    public static void main (String args[])
//
//    {
//
//        int n = 3, sum = 5;
//        finalCount("",n, sum);
//        System.out.println(ans);
//
//    }
//
//}
//
