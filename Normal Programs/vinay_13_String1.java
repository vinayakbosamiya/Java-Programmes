package strings;
import java.util.Scanner;
public class vinay_13_String1 {
    static void main() {
//        String name = new String("vinay");
//        System.out.println(name);

// //        printf example
//        int a = 10;
//        System.out.printf("the value is %d ",a);
//        take input from the user in string
        Scanner u = new Scanner(System.in);
        System.out.print("Enter Your Name :  ");
//        String user = u.next(); // get only first word throw user input
        String user = u.nextLine(); // get only full String throw user input
        System.out.println(user);


    }
}
