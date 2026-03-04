package OOP_Inheritance;

class c1{
    public int x = 4;
    protected int y = 5;
    int z = 33;
    private int a = 1111;

    public void display(){
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
        System.out.println(a);
    }
}
public class vinay_66_AccessModifiers {
    static void main(String[] args) {
        c1 c = new c1();
        c.display();

    }
}
