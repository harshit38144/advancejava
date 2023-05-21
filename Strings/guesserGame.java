package Strings;
import java.util.*;
class Guesser{
    int guessNum;
    int guessingNum(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Guesser! kindly guess the number");
        guessNum=sc.nextInt();
        return guessNum;
    }
}
class Player1 {
    int guessNum;
    int guessingNum() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Player1! kindly guess the number");
        guessNum = sc.nextInt();
        return guessNum;
    }
}
class Player2 {
    int guessNum;
    int guessingNum() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Player2! kindly guess the number");
        guessNum = sc.nextInt();
        return guessNum;
    }
}
class Player3 {
    int guessNum;
    int guessingNum() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Player3! kindly guess the number");
        guessNum = sc.nextInt();
        return guessNum;
    }
}
class Umpire{
    int numFromGuesser;
    int numFromPlayer1;
    int numFromPlayer2;
    int numFromPlayer3;
    void collectNumFromGuesser(){
        Guesser g = new Guesser();
        numFromGuesser=g.guessingNum();
    }
    void collectNumFromPlayers(){
        Player1 p1 = new Player1();
        Player2 p2 = new Player2();
        Player3 p3 = new Player3();
        numFromPlayer1=p1.guessingNum();
        numFromPlayer2=p2.guessingNum();
        numFromPlayer3=p3.guessingNum();
    }
   void compare(){
        if(numFromGuesser==numFromPlayer1){
            if(numFromGuesser==numFromPlayer2 && numFromGuesser==numFromPlayer3){
                System.out.println("All players won the game😊");
            }else if(numFromGuesser==numFromPlayer2){
                System.out.println("Player1 and Player2 won the game");
            }else if(numFromGuesser==numFromPlayer3){
                System.out.println("Player1 and Player3 won the game");
            }else{
                System.out.println("Player1 won the game");
            }
        } else if (numFromGuesser==numFromPlayer2) {
            if(numFromGuesser==numFromPlayer1 && numFromGuesser==numFromPlayer3){
                System.out.println("All players won the game");
            }else if(numFromGuesser==numFromPlayer1){
                System.out.println("Player1 and Player2 won the game");
            }else if(numFromGuesser==numFromPlayer3){
                System.out.println("Player2 and Player3 won the game");
            }else{
                System.out.println("Player2 won the game");
            }
        } else if(numFromGuesser==numFromPlayer3){
                System.out.println("Player3 won the game");
        } else {
            System.out.println("No One win the game");
        }
   }
}
public class guesserGame {
    public static void main(String[] args) {
        for(int i=0; i<3; i++){
        System.out.println("Hello");
        Umpire u = new Umpire();
        u.collectNumFromGuesser();
        u.collectNumFromPlayers();
        u.compare();
        }
    }
}
