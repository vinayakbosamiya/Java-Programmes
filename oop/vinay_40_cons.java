package oop;
import  java.util.Scanner;

class Emp{
    private  int id;
    private String name;
    public Emp(int id,String n){
        this.id = id;
        this.name = n;
    }

    public void display(){
        System.out.println("id: "+id);
        System.out.println("Name: "+name);
    }
}
public class vinay_40_cons {

    public static void main(String[] args) {
        Scanner name = new Scanner(System.in);
        Scanner id = new Scanner(System.in);


        System.out.println("Enter the your id & name: ");
        Emp e1 = new Emp(id.nextInt(),name.next());
        e1.display();
    }

}
