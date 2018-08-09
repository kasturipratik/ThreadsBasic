package com.company;

public class Main {

    /*By Extending Thread Class
 * -------------------------
 1. Create a class By extending Thread
 2. Override run() by your code
 3. Create object for the class and run start()
 4. start() automatically invokes run()
 */
        public static void main(String[] args) {
            MyThread myThread = new  MyThread();
            System.out.println(Thread.currentThread());
            myThread.start();
        }
    }

class MyThread extends Thread {
    public void run(){
        System.out.println(Thread.currentThread());
        for(int i=1; i<=10; i++)
            System.out.println(i);
    }
}