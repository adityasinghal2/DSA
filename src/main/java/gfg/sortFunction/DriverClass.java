package gfg.sortFunction;

import java.util.*;

public class DriverClass {


    public static int[] maxSlidingWindow(int[] a, int k) {
        if (a == null || k <= 0) {
            return new int[0];
        }
        int n = a.length;
        int[] r = new int[n-k+1];
        int ri = 0;
        // store index
        Deque<Integer> q = new ArrayDeque<>();
        for (int i = 0; i < a.length; i++) {
            // remove numbers out of range k
            while (!q.isEmpty() && q.peek() < i - k + 1) {
                q.poll();
            }
            // remove smaller numbers in k range as they are useless
            while (!q.isEmpty() && a[q.peekLast()] < a[i]) {
                q.pollLast();
            }
            // q contains index... r contains content
            q.offer(i);
            if (i >= k - 1) {
                r[ri++] = a[q.peek()];
            }
        }
        return r;
    }


    static int minDist(int a[], int n, int x, int y) {

        // code here


        int f = -1;
        int s = -1;

        for (int i =0;i<n;i++){

            if (a[i] == x || a[i] == y){
                if (f == -1){
                    f = i;
                }else{
                    s = i;
                    break;
                }

            }


        }

        if ((f != -1) && (s != -1))
            return s-f;
        return -1;


    }

    public static void main(String[] args){

//        int a[] = {94,36 ,35, 59, 48, 12, 50, 86, 43, 95 ,4 ,5 ,36, 28, 61 ,82 ,75, 13, 54, 58 ,24 ,9 ,59 ,88, 64 ,74 ,80 ,18 ,42 ,94,36 ,35, 59, 48, 12, 50, 86, 43, 95 ,4 ,5 ,36, 28, 61 ,82 ,75, 13, 54, 58 ,24 ,9 ,59 ,88, 64 ,74 ,80 ,18};
//        System.out.println(minDist(a, a.length, 42,68));
        int a[] = {9,8,7,6,5,4,3,2,1};
        int[] arr = maxSlidingWindow(a, 3);

        for (int i =0; i<arr.length;i++){
            System.out.print(arr[i] + "||");
        }

//        List<Student> l = new ArrayList<>();
//        l.add(new Student("adi", 30, 20));
//        l.add(new Student("ram", 21, 11));
//        l.add(new Student("ewfd", 90, 55));
//        l.add(new Student("efgdc", 3, 43));
//        l.add(new Student("lksq", 32, 89));
////
//        Collections.sort(l);
////
//        l.forEach(System.out::println);
//
//
//        // creating the Objects of Geek class.
//        HashCode g1 = new HashCode("aa", 1);
//        HashCode g2 = new HashCode("aa", 2);
//
//        // comparing above created Objects.
//        if(g1.hashCode() == g2.hashCode())
//        {
//
//            if(g1.equals(g2))
//                System.out.println("Both Objects are equal. ");
//            else
//                System.out.println("Both Objects are not equal. ");
//
//        }
//        else
//            System.out.println("Both Objects are not equal. ");
    }

}
