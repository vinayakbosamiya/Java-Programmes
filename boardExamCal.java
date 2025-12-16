// this program is take your 10th marksSheet data and find a percentages
import java.util.Scanner;
public class boardExamCal {
    static void main() {

        Scanner m1 = new Scanner(System.in);
        Scanner m2 = new Scanner(System.in);
        Scanner m3 = new Scanner(System.in);
        Scanner m4 = new Scanner(System.in);
        Scanner m5 = new Scanner(System.in);
        Scanner m6 = new Scanner(System.in);
        Scanner m7 = new Scanner(System.in);

        System.out.println("enter the marks 1 ");
        double marks1 = m1.nextDouble();
        System.out.println("enter the marks 2 ");
        double marks2 = m2.nextDouble();
        System.out.println("enter the marks 3 ");
        double marks3 = m3.nextDouble();
        System.out.println("enter the marks 4 ");
        double marks4 = m4.nextDouble();
        System.out.println("enter the marks 5 ");
        double marks5 = m5.nextDouble();
        System.out.println("enter the marks 6 ");
        double marks6 = m6.nextDouble();



        double total = marks1 + marks2 + marks3 + marks4 + marks5 + marks6;
        double perc = total / 6;

//        System.out.println("enter the marks 6 ");
//        double marks7 = m7.nextDouble();
//        double total = marks1 + marks2 + marks3 + marks4 + marks5 + marks6 + marks7;
//        double perc = total / 7;

        System.out.println("the total is : "+total);
        System.out.println("the percentage  is : "+perc);

    }
}
