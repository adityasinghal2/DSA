package gfg.algorithm;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class PriviousGreaterElement {

    public static void  priviousGreaterElementHelper(int[] arr){

        Stack<Integer> s = new Stack<>();


        s.push(arr[0]);
        System.out.println("g."+ " big " + 2*3);
        for(int i=1; i < arr.length;i++){
            if (s.peek() > arr[i]){
                System.out.println(s.peek());
            }else{
                while(!s.isEmpty()){
                    if (  s.peek() <= arr[i]){
                        s.pop();
                    }else{
                        System.out.println(s.peek());
                        break;
                    }
                }
            }
            if (s.isEmpty()){
                System.out.println("-1");
            }

            s.push(arr[i]);

        }



    }

    public static void main(String[] args){


        Queue<Integer> q = new LinkedList<>();
        q.add(1);

        while(!q.isEmpty()){
            int s = q.poll();


        }


        int[] arr = {40, 30, 20, 10};
        priviousGreaterElementHelper(arr);
//        for (int i =0; i<arr.length;i++){
//            System.out.print(arr[i] + "||");
//        }

    }
}

//-1, 10, 4, -1, -1, 40, 40
