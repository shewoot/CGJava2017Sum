
/**
 * Write a description of class ChallengeMultiplicationTables here.
 *
 * @author Sheila Wooten
 * @version 8/28/17)
 */

import java.util.Scanner;
import java.io.*;
public class ChallengeMultiplicationTables
{
    public static void main(String[]args)
    {
        Scanner S = new Scanner(System.in);
        System.out.println("Welcome to Multiplication Tables");
        System.out.println("How large would you like to see the them?  ");
        int size = S.nextInt();
        System.out.print("  ");
        for(int i = 0; i <= size; i++)
        {   
            System.out.format("%4d", i );
        }
        System.out.println();
        for(int i = 0; i <= size; i++)
        {
            if (i < 10)
            {
                System.out.print(" " + i);
            }
            else
            {
                System.out.print(i);
            }
            for(int j = 0; j <= size; j++)
            {
                int k =  i*j;
                if(k < 20)
                    System.out.format("%4d", k);
                else
                    System.out.format("%4d", k);
            }
            System.out.println();
        }           
    }
}
