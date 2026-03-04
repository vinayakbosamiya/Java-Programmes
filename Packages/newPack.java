package latest.new_package;
// this file is use for package

public class newPack{
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
    public static void main(String[] args){
        // System.out.println("this is the main method !");
    }
}

/*

Public Specifier Table

-----------------------------------------------------------------------------------------------
|    Modifier     |        Class       |        Package       |    SubClass   |  Global/World |
--------------------------------------------------------------------------------------------- |
|    Public       |         YES        |          YES         |      YES      |       YES     |
|    Protected    |         YES        |          YES         |      YES      |        NO     |
|    Default      |         YES        |          YES         |       NO      |        NO     |
|    Private      |         YES        |           NO         |       NO      |        NO     |
-----------------------------------------------------------------------------------------------
*/
