package gfg.recursion;

public class KthSymbolGrammer {

        public static int kthGrammar(int N, int K) {

            if (N==1){
                return 0;
            }

            if (K%2 == 1){
                return kthGrammar(N-1, (K+1)/2);
            }else{
                return invert(kthGrammar(N-1, K/2));
            }

        }

        public static int  invert(int v){
            if(v == 0){
                return 1;
            }
            return 0;
        }

    public static void  main(String[] args){
        System.out.println(kthGrammar(5, 9));

    }



}
