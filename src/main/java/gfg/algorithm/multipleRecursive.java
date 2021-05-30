package gfg.algorithm;

public class multipleRecursive {

    public static int multipleRecursiveHealper(int a, int b){

        if (b==0){
            return 1;
        }
        if (b%2 ==0){
            int y = multipleRecursiveHealper(a, b/2);
            return y * y;
        }else{
            return a * multipleRecursiveHealper(a, b-1);
        }

    }

    // Driver program to test printPowerSet
    public static void main (String[] args)
    {
        System.out.println(multipleRecursiveHealper(5, 3));
    }

}
