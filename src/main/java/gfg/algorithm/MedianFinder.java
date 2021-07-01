package gfg.algorithm;

import java.util.PriorityQueue;
import java.util.Queue;

class MedianFinder {
    private static Queue<Integer> small = new PriorityQueue<Integer>((a,b)->b-a); //In a reverse order
    private static Queue<Integer> large = new PriorityQueue<Integer>();   //In a natural order

    // Adds a number into the data structure.
    public static void addNum(int num) {
        small.add(num);
        large.add(small.poll());
        if (small.size() < large.size())
            small.add(large.poll());
    }

    // Returns the median of current data stream
    public static double findMedian() {
        return small.size() > large.size()
                ? small.peek()
                : (large.peek() + small.peek()) / 2.0;
    }

    public static void main(String[] args) {
        addNum(1);
        addNum(4);
        addNum(2);
        addNum(3);
        addNum(5);
        System.out.println(findMedian());

    }
}