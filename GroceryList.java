import static java.lang.System.out;
import java.util.Scanner;

public class GroceryList
{
    public static void main (String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
 
        out.println("Please list three items on your grocery shopping list.");
        out.print("Item 1?  "); 
        String item1 = keyboard.nextLine();
        out.print("Item 2?  ");
        String item2 = keyboard.nextLine();
        out.print("Item 3?  ");
        String item3 = keyboard.nextLine();
        out.println(" ");
        out.println("Now, please enter the quantity of each item. ");
        out.print("How many " + item1 + "?  ");
        float count1 = keyboard.nextFloat();
        out.print("How many " + item2 + "?  ");
        float count2 = keyboard.nextFloat();
        out.print("How many " + item3 + "?  ");
        float count3 = keyboard.nextFloat();
        out.println(" ");
        out.println("Now, please enter the price of each item. ");
        out.print("How much does one " + item1 + " cost? ");
        float price1 = keyboard.nextFloat();
        out.print("How much does one " + item2 + " cost? ");
        float price2 = keyboard.nextFloat();
        out.print("How much does one " + item3 + " cost? ");
        float price3 = keyboard.nextFloat();
        
        float cost1 =  count1 * price1;
        float cost2 =  count2 * price2;
        float cost3 =  count3 * price3;
     
        float groceryBill = cost1 + cost2 + cost3;
        out.println(" ");
        out.println("Calculating your grocery bill.");
        out.println(" ");
        out.println("Your total cost is = $"  + groceryBill);
    }
}
    




