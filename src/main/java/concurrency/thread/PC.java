package concurrency.thread;

import java.util.LinkedList;

public class PC {

    // Create a list shared by producer and consumer
    // Size of list is 2.
    LinkedList<Integer> list = new LinkedList<>();
    int capacity = 2;

    // Function called by producer thread
    public void produce() throws InterruptedException
    {
        int value = 0;
        while (true) {
            synchronized (this)
            {
                // producer thread waits while list
                // is full
                while (list.size() == capacity) {
                    notify();
                    System.out.println("Producer wait");
                    wait();
                }
                System.out.println("Producer produced-"
                        + value);

                // to insert the jobs in the list
                list.add(value++);
                value = value%2;

                // notifies the consumer thread that
                // now it can start consuming

                System.out.println("Producer notify");


                // makes the working of program easier
                // to  understand
                Thread.sleep(1000);
            }
        }
    }

    // Function called by consumer thread
    public void consume() throws InterruptedException
    {
        while (true) {
            synchronized (this)
            {
                // consumer thread waits while list
                // is empty
                while (list.size() == 0) {
                    notify();
                    System.out.println("Consumer wait");
                    wait();
                }

                // to retrive the ifrst job in the list
                int val = list.removeFirst();

                System.out.println("Consumer consumed-"
                        + val);


//                System.out.println("Producer notify");


                // and sleep
                Thread.sleep(1000);
            }
        }
    }
}
