package OOP_Inheritance;
// inheritance in interface
interface parent{
    void math1();
    void math2();

}
interface child extends parent {
 void math3();
}

class sample implements child{

    public void math1() {
        System.out.println("Math1");
    }

    public void math2(){
        System.out.println("Math2");
    }

    public void math3(){
        System.out.println("Math3");
    }

    public void math4(){
        System.out.println("Math4");
    }
}
public class vinay_57_58_Inheritance_in_Interface {
    static void main(String[] args) {
        sample s = new sample();
        s.math1();
        s.math2();
        s.math3();
        s.math4();

    }
}
