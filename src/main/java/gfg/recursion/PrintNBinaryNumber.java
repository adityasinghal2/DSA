package gfg.recursion;

import java.util.ArrayList;
import java.util.List;

public class PrintNBinaryNumber {


    public static void printNBinaryNumber(int n, String op, List<String> arr, int oCount, int zCount){
        if (n == 0) {
                arr.add(op);
            return;
        }

        printNBinaryNumber(n-1, op + "1", arr, oCount+1, zCount);
        if(oCount > zCount)
            printNBinaryNumber(n-1, op + "0", arr, oCount, zCount+1);


    }

    public static void  main(String[] args){
        List<String> arr = new ArrayList<String>();
        printNBinaryNumber(3, "", arr, 0, 0);

        for (int i =0; i<arr.size();i++){
            System.out.print(arr.get(i) + "|");
        }
    }

}
