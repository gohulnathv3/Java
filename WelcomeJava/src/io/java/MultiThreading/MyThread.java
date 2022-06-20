package io.java.MultiThreading;

public class MyThread implements Runnable{
    public static void main(String[] args) {
        Thread thread1 = new Thread(new MyThread());
        thread1.setName("First_Thread");
        thread1.start();

    }

    @Override
    public void run() {
        System.out.println("Thread Name: "+Thread.currentThread().getName());
        for (int i = 0; i<5; i++){
            System.out.println("i: "+i);
        }
    }
}
