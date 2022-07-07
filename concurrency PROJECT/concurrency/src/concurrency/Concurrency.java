package concurrency;

import WaitAndNotify.OneName;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Concurrency {

    public static void main(String[] args) {
        Syn s = new Syn();
        Client1 client1 = new Client1(s);
        Client2 client2 = new Client2(s);

        Thread t1 = new Thread(client1);
        Thread t2 = new Thread(client2);
        
        t1.setName("First Thread");
        t2.setName("Second Thread");

        System.out.println("the state of the first thread "+t1.getState());
        System.out.println("the state of the second thread "+t2.getState());

        t1.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.MAX_PRIORITY);
        System.out.println("Priority for the first thread "+t1.getPriority());
        System.out.println("Priority for the second thread "+t2.getPriority());

        t1.start();

        if (t1.isAlive()) {
            System.out.println("The Thread is Alive");
        } else {
            System.out.println("The Thread is not Alive");
        }

//        try {
//            System.out.println("Current Thread: " + Thread.currentThread().getName());
//            t1.join();
//        } catch (Exception ex) {
//            System.out.println("Exception has been caught" + ex);
//        }
        
        System.out.println("the state of the first thread "+t1.getState());
        
        t2.start();
        System.out.println("Number of Threads: " + Thread.activeCount());

        System.out.println(t1.getStackTrace());
        System.out.println(t1.getThreadGroup());

//        t1.setDaemon(true);
//        if (t1.isDaemon()) {
//            System.out.println("YES: The Thread is Daemon");
//        } else {
//            System.out.println("YES: The Thread is not Daemon");
//        }

//        t1.interrupt();
//        System.out.println("The Thread has been interrupt");
//        if (t1.isInterrupted()) {
//            System.out.println("YES: The Thread has been interrupt");
//        }

//        t1.suspend();
//        System.out.println("The Thread is suspend now");
//        t1.resume();
//        System.out.println("The Thread is resume now");
//        t1.stop();
//        System.out.println("The Thread has been stopped");
    }

}
