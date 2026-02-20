package OOP_Inheritance;

class AA {
     public void display(){
         System.out.println("i am parant");
     }



}
class BB extends AA {
    @Override //  this keyword is specifying to below method is override from parent class and if you override the parent method to recommended
    public void display(){
        System.out.println("i am child");
    }
}
public class vinay_48_methodOverriding_p2  {
    static void main(String[] args) {
    BB b = new BB();
    b.display();
    }
}
