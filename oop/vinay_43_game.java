package oop;
import  java.util.Scanner;
import  java.util.Random;
class Game{
    Scanner num;
    int n;
    int rnum;

    public Game(){
        Random R = new Random();
        rnum = R.nextInt(200);
        System.out.println("rnum : " +rnum);
    }
    public void userInput(){
        System.out.println("press 0 To Terminate ! ");
        System.out.println("Guess the number: ");
        num = new Scanner(System.in);
        do{
        n =  num.nextInt();
        if(n == 0){
            System.out.println("Game Terminated!");
            break;
        }
            if( n!=rnum){
                System.out.println("num : " +n);
            }
        }while ( n != rnum);

    }
    public void check(){
        if(n == rnum){
            System.out.println("User's number is correct !");
        }else{

            System.out.println("User's number is Wrong !");
        }

    }
}
public class vinay_43_game {
    static void main(String[] args) {
    Game g = new Game();
    g.userInput();
    g.check();




    }
}
