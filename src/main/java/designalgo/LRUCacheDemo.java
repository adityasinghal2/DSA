package designalgo;


import java.util.HashMap;
import java.util.Map;

class Node{
    int key;
    int value;
    Node next;
    Node prev;
        Node(int key, int value){
            this.key = key;
            this.value = value;
            next = null;
            prev = null;
        }

}


class LRUCache{
    private int capacity = 0;
    private Node head;
    private Node tail;
    private Map<Integer, Node> map;
    LRUCache(int capacity){
        head = new Node(0,0);
        tail = new Node(0,0);
        head.next = tail;
        tail.prev = head;
        map = new HashMap<>();
        this.capacity = capacity;
    }

   private void deleteNode(Node node){
        node.prev.next = node.next;
        node.next.prev = node.prev;
    }

    private void addNode(Node node){
        node.prev = head;
        head.next.prev = node;
        node.next = head.next;
        head.next = node;
    }




    int get(int key){
        if(map.get(key) != null) {
            Node n = map.get(key);
            int r = n.value;
            deleteNode(n);
            addNode(n);
            System.out.println("Got the value : " + r
                    + " for the key: " + key);
            return r;

        }
        System.out.println("Did not get any value"
                + " for the key: " + key);
        return -1;
    }

    void set(int key, int value){
        System.out.println("Going to set the (key, "
                + "value) : (" + key + ", "
                + value + ")");

        if(map.get(key) == null) {
            Node n = new Node(key, value);
            if(capacity == map.size()){
                map.remove(tail.prev.key);
                deleteNode(tail.prev);

            }
            addNode(n);
            map.put(key, n);

        }else{
            Node nu = map.get(key);
            nu.value = value;
            deleteNode(nu);
            addNode(nu);
        }





    }



}


public class LRUCacheDemo {

    public static void main(String[] args) {
        LRUCache cache = new LRUCache(2);
        cache.set(1, 10);

        // it will store a key (1) with value 10 in the
        // cache.
        cache.set(2, 20);
        System.out.println("Value for the key: 1 is "
                + cache.get(1)); // returns 10

        // evicts key 2 and store a key (3) with
        // value 30 in the cache.
        cache.set(3, 30);

        System.out.println(
                "Value for the key: 2 is "
                        + cache.get(2)); // returns -1 (not found)

        // evicts key 1 and store a key (4) with
        // value 40 in the cache.
        cache.set(4, 40);
        System.out.println(
                "Value for the key: 1 is "
                        + cache.get(1)); // returns -1 (not found)
        System.out.println("Value for the key: 3 is "
                + cache.get(3)); // returns 30
        System.out.println("Value for the key: 4 is "
                + cache.get(4)); // return 40
    }



}
