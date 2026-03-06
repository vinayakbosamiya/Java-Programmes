    class myThread1 extends Thread{
        public myThread1(String name){
            super(name);
        }
        public  void run(){

//            System.out.println("I am Thread");

            while (true){
                System.out.println("Thanks "+ this.getName());
            }
        }
    }
public class vinay_74_Thread_Priority {
    static void main(String[] args) {
        myThread1 t1 = new myThread1("abc");
        myThread1 t2 = new myThread1("cde 'most Important Priority!'");
        myThread1 t3 = new myThread1("efg");
        myThread1 t4 = new myThread1("hij");
        t2.setPriority(Thread.MAX_PRIORITY);
        t1.start();
        t2.start();
        t3.start();
        t4.start();

    }
}
