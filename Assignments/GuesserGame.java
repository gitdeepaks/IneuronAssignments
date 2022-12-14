import java.util.Scanner;

class Guesser {
    int guessNum;

    public int guessNumber()
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Guesser kindly guess the number between 1-10");
        guessNum = scan.nextInt();

        if (guessNum < 0 || guessNum > 10) {
            System.out.printf("Invalid Input");
            guessNum = scan.nextInt();
        } else
            System.out.printf("Moving further" );
            return guessNum;


    }
}

class Player
{
    int pguessNum;

    public int guessNumber()
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("Player kindly guess the number");
        pguessNum=scan.nextInt();

        if (pguessNum < 0 || pguessNum > 10)
        {
            System.out.println("Invalid Input");
            pguessNum = scan.nextInt();
        }else {
            System.out.println("Moving further keep Guessing");
            return pguessNum;
        }
        return 0;
    }
}

class Umpire
{

    int numFromGuesser;
    int numFromPlayer1;
    int numFromPlayer2;
    int numFromPlayer3;


    public void collectNumFromGuesser()
    {
        Guesser g=new Guesser();
        numFromGuesser=g.guessNumber();

    }


    public void collectNumFromPlayer()
    {
        Player p1=new Player();
        Player p2=new Player();
        Player p3=new Player();


        numFromPlayer1=p1.guessNumber();
        numFromPlayer2=p2.guessNumber();
        numFromPlayer3=p3.guessNumber();
    }

    void compare()
    {

        if(numFromGuesser==numFromPlayer1)
        {
            if(numFromGuesser==numFromPlayer2 && numFromGuesser==numFromPlayer3)
            {
                System.out.println("Game tied all three players guessed correctly");
            }
            else if(numFromGuesser==numFromPlayer2)
            {
                System.out.println("Player 1 and Player2 won the game");
            }
            else if(numFromGuesser==numFromPlayer3)
            {
                System.out.println("Player 1 and Player3 won ");
            }
            else
            {

                System.out.println("Player 1 won the game");
            }
        }


        else if(numFromGuesser==numFromPlayer2)
        {

            if(numFromGuesser==numFromPlayer3)
            {
                System.out.println("Player 2 and Player3 won the game");
            }
            else
            {
                System.out.println("Player 2 won the game");
            }
        }



        else if(numFromGuesser==numFromPlayer3)
        {
            System.out.println("Player 3 won the game");
        }
        else
        {
            System.out.println("Game lost! try again");
        }
    }

}


public class GuesserGame {

    public static void main(String[] args) {
        // TODO Auto-generated method stub


        Umpire u=new Umpire();
        u.collectNumFromGuesser();
        u.collectNumFromPlayer();
        u.compare();

    }

}


