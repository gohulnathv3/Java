package io.java.Collections;

import javax.imageio.plugins.tiff.TIFFImageReadParam;

public class ThreadSample extends Thread{

    public synchronized void run() { // if you add synchronize before void, this will allow only one threat at a time.
        synchronized (this) {
            for (int i = 0; i < 5; i++) {
//            System.out.println("Value of i is: "+i);
                try {
                    Thread.sleep(1000); // used to run a program with 1 sec delay
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println("Th  read Name is " + Thread.currentThread().getName() + " Value of i is " + i);
            }
        }
    }

    public static void main(String[] args) {
//        ThreadSample t = new ThreadSample();
//        t.start();
        ThreadSample obj = new ThreadSample();
        Thread t1 = new Thread(obj);
        t1.setName("A");
        Thread t2 = new Thread(obj);
        t2.setName("B");
        Thread t3 = new Thread(obj);
        t3.setName("C");
        t1.start();
        t2.start();
        t3.start();

    }
}
