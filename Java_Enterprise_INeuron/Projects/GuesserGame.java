package Projects;

import java.util.Scanner;

import javax.sound.midi.Synthesizer;
import javax.swing.plaf.synth.SynthPasswordFieldUI;

import org.w3c.dom.html.HTMLMenuElement;

class Guesser {
int guessNum;
int guessNumber() {
    Scanner scan =new Scanner(System.in);

    System.out.println("Guesser kindly guess the Number");
    guessNum =scan.nextInt();
    return guessNum;
}

}

class Player {
int pgussNum;
public int guessNumber() {
    Scanner scan =new Scanner(System.in);
    System.out.println("Player kindly guessNum");
    pgussNum=scan.nextInt();
    return pgussNum;

}

}

class Umpire {

    int numFormGuesser;
    int numFromPlayer1;
    int numFromPlayer2;
    int numFromPlayer3;

   public void collectNumFromGuesser() {
        Guesser g= new Guesser();
        numFormGuesser =g.guessNumber();

    }

   public void collectNumFromPlayer() {
        Player p1 =new Player();
        Player p2 =new Player();
        Player p3 =new Player();

        numFromPlayer1=p1.guessNumber();
        numFromPlayer2=p1.guessNumber();
        numFromPlayer3=p1.guessNumber();



    }

   void compare() {
        if (numFormGuesser==numFromPlayer1){
            System.out.println("Play 1 Won");
        }else if(numFormGuesser==numFromPlayer2){
            System.out.println("Player 2 Won");

        }else if(numFormGuesser==numFromPlayer3){
            System.out.println("Player 3 Won");
        }else {
            System.out.println("Wrong guess");
        }
    }

}



public class GuesserGame {
    public static void main(String[] args) {
        

        Umpire u =new Umpire();
        u.collectNumFromGuesser();
        u.collectNumFromPlayer();
        u.compare();
    }
    
}
