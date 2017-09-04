
/**
 * We're going to write a little game! It's called Guess My Number. 
 * The computer "thinks of" a random number, and then the person 
 * tries to guess it. The computer responds with oops, higher, 
 * lower, or you got it.
 *After one round is over, the computer asks "Play again?" and if 
 *the user says "yes", it picks another random number and goes for 
 *another round. Otherwise it exits.
 *Here's a sample run.
 * 
 *I'm thinking of a number between 1 and 100.  What is it?
 *Guess: 500
Oops! That number isn't between 1 and 100.  Try again.
Guess: 50
My number is higher.
Guess: 70
My number is lower.
Guess: 60
My number is higher.
Guess: 65
My number is lower.
Guess: 63
My number is higher.
Guess: 64
You got it!  My number was 64.
Play again? yes
 I'm thinking of a number between 1 and 100.  What is it?
 Guess: 50
 
 For debugging purposes, it could be helpful to print what the computer's 
 number is before the game really starts, just so you can test your code. 
 That would look 
 like this:
 
I'm thinking of a number between 1 and 100.  What is it?
 (Hint: I'm thinking of 64.)
 Guess: 500
 Oops! That number isn't between 1 and 100.  Try again.
 Guess: 50
 My number is higher.
 
Remember to take out the hint when your code is finally working right.
 
 * @author Sheila Wooten
 * @version Version 1 8/21/2017
 */
import static java.lang.System.out;
import java.util.Scanner;
import java.util.Random;
public class GuessMyNumber
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        Random number = new Random();
        
        int guess;
        int counter = 0;
        int numberGuess = number.nextInt(100);
        int limit = 100;
        int limit1 = 1;
        boolean game = false;
        
        out.println("I'm thinking of a number between 1 and 100. ");
        out.println("What is my number?");
        out.println(" Guess: ");
        while (game == false)
        {
            guess = keyboard.nextInt();
            numberGuess = number.nextInt(100);
            
            counter++;
            if (guess == numberGuess)
            {
                game = true;
            }
            else if (guess > limit || guess < limit1)
            {
                out.println("Oops! That number isn't between 1 and 100.  Try again!!");
            }
            else if (guess < numberGuess) 
            {
                out.println("My number is higher!!");
            }
            else if (guess > numberGuess) 
            {
                out.println("My number is lower!!");
            }
            if (counter == 5)
            {
               game = false;
            }
        }
        out.println("You Got It!!    Your number was:  " + numberGuess);
        out.println("It took you " + counter + "tries!");
        out.println("Play again? ");
        //start loop again??? 
    }
}
