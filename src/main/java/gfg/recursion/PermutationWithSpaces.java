package gfg.recursion;


import java.util.ArrayList;

class PermutationWithSpaces {

        static void permutationHelper(String S, String op,  ArrayList<String> arr){

            if (S.length() == 0){
                arr.add(op);
                return ;
            }

            permutationHelper(S.substring(1), op + " " + S.substring(0,1), arr);
            permutationHelper(S.substring(1), op + S.substring(0,1), arr);

        }

        static ArrayList<String> permutation(String S){

            ArrayList<String> arr = new ArrayList<String>();
            String op =  S.substring(0,1);
            permutationHelper(S.substring(1), op, arr);

            return arr;

        }

    public static void  main(String[] args){
        ArrayList<String>  arr = permutation("ABC");

        for (int i =0; i<arr.size();i++){
            System.out.print(arr.get(i) + "||");
        }
    }


}
