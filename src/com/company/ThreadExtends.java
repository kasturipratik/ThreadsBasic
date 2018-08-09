package com.company;

/*By Implementing Runnable interface
 * ---------------------------------
 1. Create a class By implementing Runnable interface
 2. Override run() by your code
 3. Create object for the class
 4. Create object for Thread class by passing above object to the constructor
 5. invoke start() using Thread class object which invokes run()
 */

class ChildThread implements Runnable {
    public void run(){
        System.out.println(Thread.currentThread());
        for(int i=1; i<=10; i++)
            System.out.println(i);
    }
}

public class ThreadExtends {
    public static void main(String[] args) {
        ChildThread childThread = new  ChildThread();
        System.out.println(Thread.currentThread());
        Thread thread = new Thread(childThread);
        thread.start();
    }
}
