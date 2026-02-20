package OOP_Inheritance;

class A {
    public int a;


    A(int a){
        this.a = a;
        System.out.println("I am parent constructor! " + a);
    }
    public int get(){
        return  a;
    }

}
class B extends A {
    public int b;
    B(int b){
        super(b);
        this.b = b;
        System.out.println("I am child constructor!");
    }
    public int get(){
        return  b;
    }

}
public class vinay_48_methodOverriding_p1  {
    static void main(String[] args) {
        A c = new A(1212);
        B v = new B(112 );
    }
}
