package Threads;

class myThread extends Thread{
    public myThread(String name){
        super(name);
    }
    public  void run(){

            System.out.println("I am Thread");

    }
}
public class vinay_73_Thread_Constructor {
    static void main(String[] args) {
        myThread m = new myThread("vinayak");
        m.start();
        System.out.println("This is the id of the Thread is " + m.getId());
        System.out.println("This is the Name of the Thread is " + m.getName());
    }
}
