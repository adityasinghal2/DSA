package designalgo;

import java.util.Stack;

public class bigO1 {

       static class DS{

           Stack<Integer> s1 = null;
           Stack<Integer> s2 = null;
           public DS(){
               s1 = new Stack<>();
               s2 = new Stack<>();

           }

           public void insert(int a){

               if(s1.empty()){
                   s2.push(a);
               }else if (s1.peek() < a){
                   s2.push(a);
               }else {
                   s2.push(s1.peek());
               }
               s1.push(a);

           }

           public void delete(){
                s1.pop();
                s2.pop();
           }

           public int getMax(){
               return s2.peek();
           }

       }



    public static void main(String[] args) {

           DS ds = new DS();
           ds.insert(2);
           ds.insert(4);
           System.out.println(ds.getMax());
           ds.delete();
            ds.insert(5);
            System.out.println(ds.getMax());

    }
}


