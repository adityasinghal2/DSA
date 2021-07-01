package gfg.recursion;

import java.util.ListIterator;
import java.util.Stack;

public class SortStack {


    public static void insertHaelper(Stack<Integer> s, int i){

        if (s.isEmpty() || s.peek() < i){
            s.push(i);
            return;
        }
        int v = s.pop();
        insertHaelper(s, i);
        s.push(v);

    }

    public static void deleteME(Stack<Integer> s, int n, int m){

        if (n == m){
            s.pop();
            return;
        }

        int d = s.pop();
        deleteME(s, n-1, m);
        s.push(d);

    }


    static void printStack(Stack<Integer> s)
    {
        ListIterator<Integer> lt = s.listIterator();

        // forwarding
        while (lt.hasNext())
            lt.next();

        // printing from top to bottom
        while (lt.hasPrevious())
            System.out.print(lt.previous() + " ");
    }

    public static void sortHelper(Stack<Integer> s){

        if (s.size() <= 0){
            return;
        }
        int d  = s.pop();
        sortHelper(s);
//        int i = s.pop();
        insertHaelper(s, d);


    }

    public static void main(String[] args){
        Stack<Integer> s = new Stack();
        s.add(5);
        s.add(1);
        s.add(9);
        s.add(2);

//        sortHelper(s);

        deleteME(s, s.size(), s.size()/2);
        printStack(s);



    }


}
