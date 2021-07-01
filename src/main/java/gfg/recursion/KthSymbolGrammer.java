package gfg.recursion;

public class KthSymbolGrammer {

        public static int kthGrammar(int N, int K) {

            if (N==1){
                return 0;
            }

            int mid = (int) Math.pow(2,N-1)/2;
            if (mid >= K){
                return kthGrammar(N-1, K);
            }else{
                return invert(kthGrammar(N-1, K-mid));
            }

        }

        public static int  invert(int v){
            if(v == 0){
                return 1;
            }
            return 0;
        }

    public static void  main(String[] args){
        System.out.println(kthGrammar(3, 2));

    }



}
