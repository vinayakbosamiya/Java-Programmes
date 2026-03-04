package OOP_Inheritance;

/*
in interface if we create methods and that method must be defined at child class but
if we create properties / variable in interface that is not must be defined or override
* */

interface bicycle{
    int a = 10;
    void brake(int d);
    void speed(int s);
}

class hero implements bicycle{
//    int a = 20;
    public void brake(int d){
        System.out.println("the brake force is : " + d);
    }
    public void speed(int s){
        System.out.println("the speed of cycle is : " + s);
    }
}

public class vinay_55_interfaceClass {
    static void main(String[] args) {
        hero h = new hero();
        h.brake(3);
        h.speed(3);
//        h.a = 20; this "a" variable is final that is define in interface
        System.out.println("the value is "+h.a);
    }
}
/*
NOTE : -
we can create the properties in Interface
but we can not modify the properties in Interface reason is They Properties are final

 */