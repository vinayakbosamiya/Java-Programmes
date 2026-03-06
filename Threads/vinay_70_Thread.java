package Threads;
class MyThread1 extends Thread{
public void run(){
    for (int i=0;i<=4;i++){
        System.out.println("first " + i);
    }
}
}
class MyThread2 extends Thread{
public void run(){
         for (int i=3;i<=8;i++){
             System.out.println("Second " + i);
         }
}
}
public class vinay_70_Thread {
    static void main(String[] args) {

        MyThread1 m1 = new MyThread1();
        MyThread2 m2 = new MyThread2();

        m1.start(); // this method available "Thread" class and this method is call run and run1 method internally using "start()" Method
        m2.start();

    }
}
