package OOP_Inheritance;

class base1{
    public base1(){
        System.out.println("I am base constructor !");
    } public base1(int a){
        System.out.println("I am base constructor ! and value of A :" + a);
    }

}
class derived1 extends base1 {
    public int b;
    public derived1(){
        super(10); // this super keyword is called the base1 class's constructor called
        System.out.println("I am child constructor !");
    }

}
public class vinay_46_const_with_inheritance {
    static void main(String[] args) {
        derived1 b = new derived1();
    }
}
