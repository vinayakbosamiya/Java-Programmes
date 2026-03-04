package OOP_Inheritance;
abstract class  parent{
    public parent(){
        System.out.println("this is the base class 2");
    }

    abstract public void hello();
}
/* if we inherited abstract parent class at child class to must be override parent method in child class without override to show error
 and if we not override the method to convert child class in abstract class */
class child extends  parent{
    public child(){
        System.out.println("this is the child class!");
    }
    public void hello(){
        System.out.println("hello from child class");
    }
}

abstract class child2 extends  parent{
    public void hello2() {


    }
}
public class vinay_53_abstract_base_class {
    static void main(String[] args) {
        child c = new child();
        c.hello();

//        child2 ch2 = new child2(); -- throw the error
//        parent ch2 = new parent(); -- throw the error

    }
}
