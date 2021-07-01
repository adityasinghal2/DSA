package concurrency.thread;

public class ThreadTimeOut {

    Task ts = new Task();
    Thread t = new Thread(ts);

    void startTask(){
        t.start();
    }

    void stopTask(){
        ts.flag = false;
    }

    public static void main(String[] args){
        ThreadTimeOut f = new ThreadTimeOut();

        f.startTask();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        f.stopTask();

    }

}
