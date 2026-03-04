// this file is related to subClass in access modifier
//  package latest.new_package;
import latest.new_package.newPack;

 class abc extends newPack{
    public void show(){
        System.out.println(x);
        System.out.println(y);
        // System.out.println(z);
        // System.out.println(a);
    }
 }

public class newPack3{
    public static void main(String[] args){
        abc n = new abc();
        n.show();
        System.out.println("this is the main method2 !");
    }
}