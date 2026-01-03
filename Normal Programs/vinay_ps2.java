package strings;
import  java.util.Scanner;
public class vinay_ps2 {
    static void main() {
//        p1
        String ch = "      ABCD        ";
        System.out.println(ch.toLowerCase());
//        p2

        System.out.println(ch.replace(" ","_"));

//        p3
//        System.out.println("Enter the Your name: ");
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Dear <|name|>, Thanks a Lot".replace("<|name|>",sc.nextLine()));

//        p4
        String mystr = "hello i am string   how are you";
        System.out.println(mystr.indexOf("  "));
        System.out.println(mystr.indexOf("    "));

//        p5
        mystr = "hello users, \nthis is java program.\nthanks! for written";
        System.out.println(mystr);
    }
}
