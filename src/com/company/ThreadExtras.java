package com.company;

class MyThread1 extends Thread {
    public void run(){
        for(int i=1; i<=5; i++){
            System.out.println(i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
class MyThread2 extends Thread {
    public void run(){
        for(int i=6; i<=10; i++){
            System.out.println(i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
public class ThreadExtras {
    public static void main(String[] args) {
        MyThread1 myThread1 = new  MyThread1();
        myThread1.start();
        MyThread2 myThread2 = new  MyThread2();
        myThread2.start();
    }
}