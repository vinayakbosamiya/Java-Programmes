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
public class vinay_72_StructureOfThread {
    static void main(String[] args) {
        test t = new  test();
        t.start();
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