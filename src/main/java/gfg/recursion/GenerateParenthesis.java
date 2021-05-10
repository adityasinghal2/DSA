package gfg.recursion;

import java.util.ArrayList;
import java.util.List;

class GenerateParenthesis {

    public static void generateParenthesisHelper(int o, int c, String op, List<String> ans){
        if (o == 0 && c==0){
            ans.add(op);
            return;
        }

        if(o != 0) {
            generateParenthesisHelper(o - 1, c, op + "(", ans);
        }
        if (c > o) {
            generateParenthesisHelper(o, c - 1, op + ")", ans);
        }



    }


    public static List<String> generateParenthesis(int n) {

        List<String> ans = new ArrayList<String>();
        generateParenthesisHelper(n,n, "", ans);

        return ans;



    }

    public static void  main(String[] args){
        List<String>  arr = generateParenthesis(3);

        for (int i =0; i<arr.size();i++){
            System.out.print(arr.get(i) + "||");
        }
    }

}
