
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
        System.out.println("Enter the number up to whose multiplication table is needed");
        int size = S.nextInt();
        System.out.print("  ");
        for(int i = 0; i <= 20; i++)
            System.out.print(" " + i + " ");
        System.out.println();
        for(int i = 0; i <= size; i++)
        {
            System.out.print(i);
            for(int j = 0; j <= 20; j++)
            {
                int k =  i*j;
                if(k < 20)
                    System.out.print("  " + k);
                else
                    System.out.print(" " + k);
            }
            System.out.println();
        }           
    }
}
