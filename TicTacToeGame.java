import static java.lang.System.out;
import java.util.Scanner;
public class TicTacToeGame
{
    static char PLACEHOLDER = '_';
    static Scanner keyboard = new Scanner(System.in);
    public static void drawBoard(char[][] board)
    {
        out.println();
        for (int row = 0; row < 3; row++)
        {
            System.out.println(" | " + board[row][0] + " | " + board[row][1] + " | " + board[row][2] + " | ");
        }
        out.println();
    }
    public static char[][] printEmptyBoard()
    {
        char[][] gameBoard = new char[3][3];
        for (int row = 0; row < 3; row++)
        {
            for (int col = 0; col < 3; col++)
            {
                gameBoard[row][col] = PLACEHOLDER;
            }                   
        }
        return gameBoard;
    }
    public static boolean isWin(char[][] board)
    {
        return isHorizontalWin(board) || isVerticalWin(board) || isDiagonalWin(board);
    }
    public static boolean isFull(char[][] board)
    {
        for (int row = 0; row < 3; row++) 
        {
            for (int col = 0; col < 3; col++) 
            {
                if (board[row][col] == PLACEHOLDER)
                 {
                 return false;
                }           
            }
        }
        return true;
    }
    public static boolean isHorizontalWin(char[][] board) 
    {
        for (int row = 0; row < 3; row++)
        {
            if (board[row][0] != PLACEHOLDER && board[row][0] == board[row][1] && board[row][1] == board[row][2])
            {
                return true;
            }
        }
        return false;
    }
    public static boolean isVerticalWin(char[][] board)
    {
        for (int col = 0; col < 3; col++)
        {
           if (board[0][col] != PLACEHOLDER && board[0] [col] == board[1][col] && board[1][col] == board[2][col])
           {
            return true;
           } 
        }
        return false;
    }
    public static boolean isDiagonalWin(char[][] board)
    {
        if (board[0][0] != PLACEHOLDER && board[0][0] == board[1][1] && board[1][1] == board[2][2])
        {
        return true;
        }
        return false;
    }
    public static void printWelcome()
    {
        out.println();
        out.println("******************************");
        out.println("    Welcome to Tic Tac Toe!   ");
        out.println("******************************");
        out.println();
        out.println("    To start playing, enter a number for the position you want to place your turn in.");
        out.println();
        out.println("        1 | 2 | 3");
        out.println("        4 | 5 | 6");
        out.println("        7 | 8 | 9");
        out.println();
        out.println("    You will need a partner to play this game with. "); 
        out.println("    Are you ready to begin?  Let's get started.");
        out.println("*****************************************************");
    }
    public static boolean wantsToPlayAgain()
    {
        out.print("Would you like to play Tic Tac Toe again? (enter: y or n) ");
        keyboard.nextLine(); // skip leftover newline fromthe prior nextInt().input.
        String answer = keyboard.nextLine(); // get real
        return (answer.equals("y"));
    }
    public static char getTokenAtPosition(int position, char[][]board)
    {
        int row = (position - 1) / 3;
        int col = (position - 1) % 3;
        return board[row][col];
    }
    public static void placeToken(int position, char[][] board, boolean isXTurn)
    { 
        int row = (position - 1) / 3;
        int col = (position - 1) % 3;
        if (isXTurn) 
        {
            board[row][col] = 'X';
        } 
        else 
        {
            board[row][col] = 'O';
        }
    }
    public static void getPositionAndPlaceToken(char[][] board, boolean isXTurn)
    {    
        boolean invalidInput = true;
        boolean full = true;
        int position = 0;
        do 
        {
            if (isXTurn) 
            {
                out.print("Place X where? ");
            } 
            else 
            {
                out.print("Place O where? ");  
            }
            position = keyboard.nextInt();
            invalidInput = (position < 1 || position > 9);
            if (invalidInput) 
            {
                out.println("   Sorry, position" + position + " is not valid.  Try 1-9.");
            } 
            else 
            {
                full = (getTokenAtPosition(position, board) != PLACEHOLDER);
                if (full) 
                {
                    out.println("   Sorry, position " + position + " is already taken.  Pick another position.");
                }
            }
        }
        while (full || invalidInput);
        placeToken(position, board, isXTurn);
    }
    public static void game()
    {
        int xWins = 0;
        int oWins = 0;
        int draws = 0;
        boolean doesXStart = true;
        boolean isXTurn = doesXStart;
        printWelcome();
        do // all-games loop
        {
             // initialize for the beginning of a new game.
             char[][] gameBoard = printEmptyBoard();
             isXTurn = doesXStart;
             doesXStart = ! doesXStart;
             boolean gameStillGoing = true;
             drawBoard(gameBoard);
             // play the game until it's complete. Single-game loop.
             do 
             {
                 getPositionAndPlaceToken(gameBoard, isXTurn);
                 drawBoard(gameBoard);
                 if (isWin(gameBoard)) 
                 {
                     gameStillGoing = false;
                     if (isXTurn) 
                     {// X made the most recent play, so they must have won that round.
                         xWins++;
                         //game.single-game loop.isXTurn);
                         out.println("X wins!");
                     }
                     else
                     {//O made the most recent play, so they must have won that round.
                         oWins++;
                         out.println("O wins!");
                     }
                 } 
                 else if (isFull(gameBoard)) 
                 {
                     gameStillGoing = false;
                     // Nobody won, but the board is full - must be a draw. 
                     draws++;
                     out.println("  The game is a draw. Bummer! No one wins.");
                 } 
                 else 
                 {
                     // board is not full, so continue to next player's turn.
                 }
                 isXTurn = ! isXTurn;
             }  
             while (gameStillGoing);
             {
                 out.println("  Score: X = " + xWins + ", O = " + oWins + ", draws = " + draws);
             } 
             // They're done playing.  Method will return and program will finish.
        }
        while (wantsToPlayAgain());
    }
    public static void main(String[] args)
    {
        game();
        out.println("  Thanks for playing....Goodbye! ");
    }
}
       