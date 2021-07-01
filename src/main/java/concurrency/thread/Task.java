package concurrency.thread;

public class Task implements Runnable{

    public volatile boolean flag = true;
    int i =0;

    @Override
    public void run() {

        while(flag) {
            System.out.println("Start Task" + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Completed Task" + i);
            i++;
        }

    }
}
