package OOP_Inheritance;

class phone{
    public void great(){
        System.out.println("this is the great");
    }
    public void name(){
        System.out.println("This is phone");
    }
}
class smartphone extends  phone{
    public  void name(){
        System.out.println("this is smartphone");
    }
    public  void music(){
        System.out.println("playing music....");
    }
}
public class vinay_49_Dynamic_Method_Dispatch {
    static void main(String[] args) {
// below is called  "dynamic method dispatch " this is usefull for run time polymorphism
/*        below reference is parent class and object is child class if we call the methods of object that must be defined at parent class
        if method is not available at parent class to throw the error */
        phone obj = new smartphone();
        obj.name(); // this method is available at parent class
//        obj.music(); // not allowed this method is not available at parent class this is throw the error because variable is reference of parent class
    }
}
