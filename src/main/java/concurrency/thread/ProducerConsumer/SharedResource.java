package concurrency.thread.ProducerConsumer;

import java.util.LinkedList;
import java.util.List;

public class SharedResource {

    List<Integer> l = new LinkedList<>();
    int maxCapacity = 2;
    int value = 0;

    void produce(){

        while(true){

            synchronized (this){

                if(l.size() == maxCapacity){
                    try {
                        wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

                l.add(value++);
                System.out.println("Producer --> added " + value);
                notifyAll();

            }



        }

    }



}
