

/*Now, time to REALLY practice 

Level 1 Mastery: Every time you play Single-player "Guess my number", the guessable number is different. (HINT: print the result to the screen while testing to make life easier on yourself)

Level 2 Mastery: The game asks two players for their name before the game starts

Level 3: The first player has the chance to guess. If they guess correctly, print a victory statement, and the game ends!

Level 4: If the first player guesses incorrectly, play passes to player 2, who has a chance to guess. 

Level 5: Play continues several times before someone guesses correctly. The victory message contains the name of the winner!

Level 6: If each player has guessed incorrectly 5 times, they both lose! Print the number and mock the players on their poor guessing abilities. 
 * @author Sheila Wooten
 * @version Version 1 8/21/2017
 */
import static java.lang.System.out;
import java.util.Scanner;
import java.util.Random;
public class TwoPlayerGuessMyNumber
{
    public static void main(String[] args)
    {
        Scanner inputKeyboard = new Scanner(System.in);
        Random randomNumber = new Random();
        
        int yourGuess = 0;
        int counter = 0;
        String player1 = "";
        String player2 = "";
        int numberGuess = randomNumber.nextInt(100);
        int numberLimit2 = 100;
        int numberLimit1 = 1;
        //String winner = "";
        boolean gameWin = false;
        out.println("I'm thinking of a number between 1 and 100. ");
        out.println("Enter the player's names... ");
        player1 = inputKeyboard.nextLine();
        
        player2 = inputKeyboard.nextLine();
        
        while (gameWin == false)
        {
            out.println(numberGuess);
            yourGuess = inputKeyboard.nextInt();
            counter++;
            out.println(player1 + " Your Guess: ");
            numberGuess = randomNumber.nextInt(100);
            if (yourGuess == numberGuess)
            {
                 gameWin = true;
                 
            }
                if (counter == 5)
                {
                    gameWin = false;
                    out.println("You BOTH LOOSE!! You both need to go get some coffee so you can guess better!!");
                    return;
                }
            else if (yourGuess > numberLimit2 || yourGuess < numberLimit1)
            {
                out.println("Oops! That number isn't between 1 and 100.  Next!!");
                out.println(player2 + " Your Guess: ");
            }
            else if (yourGuess < numberGuess) 
            {
                out.println("Guess higher!!");
                out.println(player2 + " Your Guess: ");
            }
            else if (yourGuess > numberGuess) 
            {
                out.println("Guess lower!!");
                out.println(player2 + " Your Guess: ");
            }
        } 
        out.println("You Got It..." + player1 + " YOU WON!!     Your number was:  " + numberGuess);
        out.println("It took you " + counter + " tries!");
        
    }
}