package strings;

import java.util.Scanner;


public class vinay_20_switch_case_p2 {
    static void main() {
        System.out.println("Enter your age: ");
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        switch (age)
        {
            case 1->{
                System.out.println("this is case 1");
            }

            case 2->{

                System.out.println("this is case 2");
            }

            case 3->{

                System.out.println("this is case 3");
            }

            case 4->{

                System.out.println("this is case 4");
            }

            default->{
                
                System.out.println("sorry Your age is not available ! ");
            }
        }
    }
}