package strings;

import java.util.Scanner;


public class vinay_20_switch_case {
    static void main() {
        System.out.println("Enter your age: ");
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        switch (age)
        {
            case 1:
                System.out.println("this is case 1");
                break;
            case 2:
                System.out.println("this is case 2");
                break;
            case 3:
                System.out.println("this is case 3");
                break;
            case 4:
                System.out.println("this is case 4");
                break;
        }
    }
}
