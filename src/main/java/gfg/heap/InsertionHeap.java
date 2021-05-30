package gfg.heap;

import java.util.ArrayList;
import java.util.List;

public class InsertionHeap {



    public static void insertNode(List<Integer> arr, int n, int value){

            arr.add(value);
            n = n + 1;
            int i = n-1;

            while(i > 0) {
                int parent = i/2;
                if (arr.get(parent) < arr.get(i)) {
                    int t = arr.get(i);
                    arr.set(i, arr.get(parent));
                    arr.set(parent, t);
                    i = parent;

                } else {
                    return;
                }

            }


    }

    public static void deleteNode(List<Integer> arr, int n){

        int lastElement = arr.get(n-1);

        arr.set(0, lastElement);
        arr.remove(n-1);

        maxHeapify(arr, arr.size(), 0);


    }


    public static void maxHeapify(List<Integer> arr, int n, int index){

        int largest = index;
        int left = 2 * index +1;
        int right = 2 * index +2;

        if (left < n && arr.get(left) > arr.get(largest)){

            largest = left;
        }

        if (right < n && arr.get(right) > arr.get(largest)){
            largest = right;
        }

        if (index != largest){
            int t = arr.get(index);
            arr.set(index, arr.get(largest));
            arr.set(largest, t);
            maxHeapify(arr, n, largest);


        }



    }

    public static void heapSort(List<Integer> arr, int n){

        for(int i = n/2-1;i>=0;i--){
            maxHeapify(arr, n, i);
        }

        for (int i = n-1;i>=0;i--){
            int t = arr.get(0);
            arr.set(0,arr.get(i));
            arr.set(i, t);
            maxHeapify(arr, i, 0);
        }


    }




    public static void main(String args[])
    {
        // Array representation of Max-Heap
        // 10
        //    /  \
        // 5    3
        //  / \
        // 2   4
        List<Integer> h = new ArrayList<>();
        h.add(15);
        h.add(20);
        h.add(7);
        h.add(9);
        h.add(30);

        int n = h.size();

        for(int i = n/2-1;i>=0;i--){
            maxHeapify(h, n, i);
        }

//        deleteNode(h, n);

        insertNode(h, n, 10);

        for (int i =0; i<h.size();i++){
            System.out.print(h.get(i) + "||");
        }

    }

}
