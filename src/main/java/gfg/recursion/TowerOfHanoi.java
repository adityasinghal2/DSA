package gfg.recursion;

public class TowerOfHanoi {

    static int count = 0;

    public static void printTowerOfHanoi(int s, int d, int h, int n){
        count++;
        if (n == 1){
            System.out.println("Move plate " + n + " from tower "+ s + " to " + d);
            return;
        }
        printTowerOfHanoi(s, h, d, n-1);
        System.out.println("Move plate " + n + " from tower "+ s + " to " + d);
        printTowerOfHanoi(h, d, s, n-1);

    }

    public static void  main(String[] args){

        int numberOfDisc = 3;
        printTowerOfHanoi(1,3,2, numberOfDisc);
        System.out.println("Steps to perform the operations "+ count);
    }

}
