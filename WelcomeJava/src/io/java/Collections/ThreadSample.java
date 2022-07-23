package io.java.Collections;

// Revision 2

//public class ThreadSample extends Thread{
public class ThreadSample implements Runnable{

    public synchronized void run() { // if you add synchronize before void, this will allow only one threat at a time.
        synchronized (this) {
            for (int i = 0; i < 5; i++) {
//            System.out.println("Value of i is: "+i);
                try {
                    System.out.println("Thread going to sleep : "+Thread.currentThread().getName());
                    Thread.sleep(10000); // used to run a program with 1 sec delay
                    synchronized (this){
                        this.notifyAll();
                    }
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println("Thread Name is " + Thread.currentThread().getName() + " Value of i is " + i);
            }
        }
    }

    public void letsWait() throws InterruptedException {
        System.out.println(Thread.currentThread().getName()+" Entered");
        synchronized (this){
            wait();
        }
        System.out.println(Thread.currentThread().getName()+ " Thread wakeup");
    }

    public static void main(String[] args) throws InterruptedException {
//        ThreadSample t = new ThreadSample();
//        t.start();
        System.out.println("Thread: "+Thread.currentThread().getName());
        ThreadSample obj = new ThreadSample();
        Thread t1 = new Thread(obj);
        t1.setName("A");
//        Thread t2 = new Thread(obj);
//        t2.setName("B");
//        Thread t3 = new Thread(obj);
//        t3.setName("C");
        t1.start();
        obj.letsWait();
//        t2.start();
//        t3.start();
    }
}
