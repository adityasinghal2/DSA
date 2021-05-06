package gfg.recursion;

import java.util.Stack;

import static gfg.recursion.SortStack.printStack;

public class DeleteMEStack {


    public static void deleteMElement(Stack<Integer> s, int mid){

        if (mid == 0){
            s.pop();
            return;
        }
        int i = s.pop();
        deleteMElement(s, mid -1);
        s.push(i);


    }
    public static void main(String[] args){
        Stack<Integer> s = new Stack();
        s.add(5);
        s.add(1);
        s.add(9);
        s.add(2);
        s.add(3);
        if (s.size()%2 == 0) {
            deleteMElement(s, (s.size()/2)-1);
        } else{
            deleteMElement(s, s.size()/2);
        }

        printStack(s);

    }
}
