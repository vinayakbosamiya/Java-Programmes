package strings;

import java.util.Scanner ;

class JavaPrograms {
    public static void main(String[] args) {
        float us = 90.73f;
        System.out.println("Enter Your Amount : ");
        Scanner sc = new Scanner(System.in);
        double inr = sc.nextDouble() * us;
        System.out.printf("Your Amount is %.2f", inr);




    }
}
