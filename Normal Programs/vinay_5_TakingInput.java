import java.util.Scanner;
public class vinay_5_TakingInput {
    static void main() {
        System.out.println("taking input from users");                     // Print some default text
//        Scanner sc1 = new Scanner(System.in);                              // that is obj created using scanner-class and new - keyword for take input from the users and system.in means take input from the keyboard
//        Scanner sc2 = new Scanner(System.in);                              // that is obj created using scanner-class and new - keyword for take input from the users and system.in means take input from the keyboard
//        Scanner sc3 = new Scanner(System.in);                              // that is obj created using scanner-class and new - keyword for take input from the users and system.in means take input from the keyboard
//        System.out.println("Enter The Number 1");                          // Print some default text
////        int a = sc1.nextInt();                                           // that is taken only integer input and stored inside the "a" using nextInt();
//
//        float a = sc1.nextFloat();                                         // that is taken only float input and stored inside the "a" using nextFloat();
//        System.out.println("Enter The Number 2");                          // Print some default text
//
////        int b = sc2.nextInt();                                           // that is taken only integer input and stored inside the "b" using nextInt();
//
//        float b = sc2.nextFloat();                                         // that is taken only float input and stored inside the "b" using nextFloat();
////        int c = a + b;
//        float c = a + b;
//
//        System.out.println("the sum of a + b : "+c);
//
//        boolean b1 = sc3.hasNextInt();                                     // that is take input and check entered number is integer or not and return boolean values
//        System.out.println("is the number is integer ?: "+ b1);

        Scanner sc44 = new Scanner(System.in);
//        String str = sc44.next(); // take only one word of the strings
        String str = sc44.nextLine(); // take all words of the strings
        System.out.println(str);
    }
}
