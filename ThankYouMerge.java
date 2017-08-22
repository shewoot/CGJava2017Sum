
/**
 * Your favorite charity has contacted you for help. 
 * They recently ran a successful fundraiser and they 
 * want to send a personalized thank you note to every donor.
 *They will provide you with the text of the letter. 
 *They will use the software (after you build it) to type 
 *in the donor names and amounts. For each donor, your 
 *software will print a thank you letter personalized for 
 *that donor. When the charity is done entering donor names, 
 *they will type the word quit instead of the next name.
 *Here is the text of the thank you letter.
 
Dear person name,
 Thank you for your donation!  We rely on donors like you to keep our
 organization effective, and you came through for us. Your donation of $x.xx
 will help our efforts to make a difference in the world.
 As you may know, we are a registered non-profit organization, so your
 donation is tax deductible.  You may use this letter as a receipt for tax
 purposes.
Thank you again for your support!
 Sincerely,
 Paula Jones
YourCharity.org
 
Just to make sure you're clear, here's how the software should work:
1. The charity runs the software.
2. The software prints its title "--- Thank You Letters ---" just once at the start.
3. The software asks for a person's name.
4. The charity types in the firstname lastname (together) and presses Enter.
5. The software asks for a person's donation amount.
 Copyright © 2014 Jenny Brown
Page 1
Practice: Thank You Mail Merge
 6. The charity types in the donation amount without the dollar sign.
7. The software prints the thank you letter with that name and amount.
8. The software asks for the next person's name. If the charity types in the word quit
instead of a name, the software ends. Otherwise it continues on asking for donation amount and printing the next thank you letter.
Planning Your Code
1. Figure out what goes before the while loop, inside the while loop, and after the while loop.
2. Figure out the condition for the while loop - when should keepGoing become false?
3. Figure out what variables you need for data entry, and their data types.
4. Figure out how to ask for data and then print thank you letters.
5. Verify that you know how to compare Strings. (Hint, it's not == and you did have an
example in an earlier assignment.)
6. Quirk: Keyboard input for a number leaves a newline in the buffer which gets picked up
later when you ask for the name. You may have to call nextLine() an extra time. You'll see this once you start coding.
 
Coding Syntax Examples - Reference Guide
boolean keepGoing = true;
while (keepGoing)
{
    // do some stuff
}
 Testing
 Test with one donor name and amount; then quit.
 Test with three donor names and amounts; then quit.
 Test with zero donor names by typing quit as the very first name.
 Test with several donor names and amounts.
For each case, ensure that the name is printed in the right place, the 
donation amount is in the right place, and that quitting works. Make 
sure it prints one letter for each donor with their own name in it, 
so if there are 3 donors, then you should have 3 thank you letters.
*
 * @author Sheila Wooten
 * @version Version 1 
 */
import static java.lang.System.out;
import java.util.Scanner;
public class ThankYouMerge
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        String wantToStop = "";
        boolean keepGoing = true;
        String donorName = "";
        String donorAmount = "";
        while (keepGoing)
        { 
            System.out.println("");
            System.out.println("---Thank You Letters---");
            System.out.println("");
            System.out.println("What is the donor first and last name?  ");
            donorName = keyboard.nextLine();  
            if (wantToStop.equals ("quit"))
            {
                System.out.println("You have quit.");
                keepGoing = false;
            }
            else
            {
                System.out.println("What is the donation amount? $ ");
                donorAmount = keyboard.nextLine();
                System.out.println("Press enter for your letter");
                wantToStop = keyboard.nextLine();System.out.println("");
                System.out.println("Dear " + donorName + ",");
                System.out.println("");
                System.out.println("Thank you for your donation!  We rely on donors like you to keep our");
                System.out.println("organization effective, and you came through for us. Your donation of $"+ donorAmount);
                System.out.println("will help our efforts to make a difference in the world.");
                System.out.println("");
                System.out.println("As you may know, we are a registered non-profit organization, so your");
                System.out.println("donation is tax deductible.  You may use this letter as a receipt for tax");
                System.out.println("purposes.");
                System.out.println("");
                System.out.println("Thank you again for your support!");
                System.out.println("");
                System.out.println("Sincerely,");
                System.out.println("Paula Jones");
                System.out.println("YourCharity.org");
            }
        }
    }
}