package gfg.recursion;

import java.util.Stack;

public class NextSmallerElement {

    public static void nextSmallerElement(int[] arr, int n){

        int temp = arr[n-1];
        System.out.println("-1");

        for (int i = n-2;i>= 0;i--){
            if (arr[i] < temp){
                System.out.println("-1");
                temp = arr[i];
            }else{
                System.out.println(temp);
            }

        }

    }

    public static void  main(String[] args){
        Stack<Integer> s = new Stack<>();

        int[] arr = {2,4,7,1,5};
        s.push(arr[arr.length-1]);

        for (int i = 0;i<= arr.length-1;i++){

            if (s.isEmpty()){
                s.push(arr[i]);
                continue;
            }

            while(!s.isEmpty() && s.peek() > arr[i]) {
                s.pop();

            }
            if (!s.isEmpty() && s.peek() < arr[i]){
                System.out.println(s.peek());
            }

            s.push(arr[i]);
        }

//        while (s.empty() == false) {
//            System.out.println(s.peek() + " --> " + "-1");
//            s.pop();
//        }



//        nextSmallerElement(arr, arr.length);
    }

}
