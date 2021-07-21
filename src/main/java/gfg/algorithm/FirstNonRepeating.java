package gfg.algorithm;

import java.util.HashMap;
import java.util.Map;

public class FirstNonRepeating {

    static Node head = null;
    static Node tail = null;
    static Map<Character,Node> m = new HashMap<>();

    static class Node{
        char c;
        Node next = null;
        Node prev = null;

        Node(char c){
            this.c = c;
        }
    }

    static void removeUtility(Node n){

        if(head == null){
            return;
        }

        if(tail == n){
            tail = tail.prev;
        }
        if(head == n){
            head = head.next;
        }

        if(n.prev != null){
            n.prev.next = n.next;

        }
        if(n.next != null){
            n.next.prev = n.prev;
        }


    }

    static void addUtility(Node n){

        if(head == null){
            head = n;
            tail = n;
            return;
        }
        tail.next = n;
        n.prev = tail;
        tail = n;
    }

    static char getFirstRepeatingChar(char c){

        if(m.containsKey(c)){

            if(m.get(c) != null){
                removeUtility(m.get(c));
                m.put(c,null);
//                return '#';
            }


        }else{
            Node n = new Node(c);
            addUtility(n);
            m.put(c,n);

        }


        return head.c;
    }




    public static void main(String[] args) {

        String stream = "wefwrnferf";
        for(char a: stream.toCharArray()){

            System.out.println(getFirstRepeatingChar(a));
        }


    }

}
