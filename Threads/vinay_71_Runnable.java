package Threads;

class MyThreadRunnable1 implements Runnable{

    public void run(){
        for(int i = 1;i<=10;i++){

        System.out.println("i am thread1");
        }

    }

}

class MyThreadRunnable2 implements Runnable{

    public void run(){
        for(int i = 1;i<=10;i++){

        System.out.println("i am thread2");
        }

    }

}

public class vinay_71_Runnable {
    static void main(String[] args) {
    MyThreadRunnable1 bullet1 = new MyThreadRunnable1();
    MyThreadRunnable2 bullet2 = new MyThreadRunnable2();

    Thread gun1 = new Thread(bullet1);
    Thread gun2 = new Thread(bullet2);

    gun1.start();
    gun2.start();
    }
}

/*
// below is available Structure Of Thread class  
package Threads;

abstract class tt{
    abstract void run();
    void start(){
        run();
//        System.out.println("i am Start method");
    }
}

class test extends tt{
    void run(){
        System.out.println("i am run method");

    }
}
public class vinay_72_t {
    static void main(String[] args) {
        test t = new  test();
        t.start();
    }
}

 */