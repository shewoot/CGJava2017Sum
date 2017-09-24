
/**
 Your neighborhood gardener has made a chart of daily temperatures for the past week. 
 She's going to provide more data later, but first she wants a proof of concept 
 program that calculates average temperatures at a given time of day.
Here's the data chart. In the below sample run, you'll see 99's used as examples. 
In your real program, you should use the data in THIS CHART instead.

Sun Mon Tue Wed Thu Fri Sat 0123456
7:00 AM 3:00 PM 7:00 PM 3:00 AM
 
 0 1 2 3
 
68 70 76 70 68 71 75
76 76 87 84 82 75 83
73 72 81 78 76 73 77
64 65 69 68 70 74 72
 
  Put this data into a multi-dimensional array (7 by 4) inside your code. 
  Then, calculate averages in both directions over the data:
1. What is the average temperature for each day? (Your code should produce 7 results.)
2. What is the average temperature for each time? (Your code should produce 4 results.)
3. What is the final average temperature overall? (Your code should produce 1 result.)
You will probably want to use nested for loops to navigate the array. 
The outer for-loop identifies the row (time of day), while the inner for-loop 
identifies the column (day of week).Copyright © 2014 Jenny Brown Page 1

Practice: Temperatures
 Here is a sample run. The values here are wrong for the above data; you'll need 
 to run your own calculation in your code. (I couldn't make it that easy!)
 
Temperature Calculator
 The data provided are:
7 AM: 68, 70, 76, 70, 68, 71, 75
3 PM: 76, 99, 99, 99, 99, 99, 99
7 PM: 99, 99, 99, 99, 99, 99, 99
3 AM: 99, 99, 99, 99, 99, 99, 99
Based on that data, the following are the average temperatures for the week.
Sun: 87
Mon: 88
Tue: 87
Wed: 88
Thu: 87
Fri: 88
Sat: 87
7 AM: 85
3 PM: 96
7 PM: 87
3 AM: 81
The final average temperature for the week was:
Overall: 99
 
 
Coding Syntax Examples - Reference Guide
int[][] temps = new int[4][7];
temps[0][0] = 68;
temps[3][6] = 72;
 
Testing
 Verify your results by calculating the averages by hand.
 Pay attention to the effects of rounding.
 Check that if you change the data values, the averages change automatically.
 * @author Sheila Wooten
 * @version 9/10/17
 */

import static java.lang.System.out;
public class Temperatures
{
    public static void main (String[] args)
    {
        int[][] temps = new int[4][7];
        temps[0][0] = 68;
        temps[0][1] = 70;
        temps[0][2] = 76;
        temps[0][3] = 70;
        temps[0][4] = 68;
        temps[0][5] = 71;
        temps[0][6] = 75;
        temps[1][0] = 76;
        temps[1][1] = 76;
        temps[1][2] = 87;
        temps[1][3] = 84;
        temps[1][4] = 82;
        temps[1][5] = 75;
        temps[1][6] = 83;
        temps[2][0] = 73;
        temps[2][1] = 72;
        temps[2][2] = 81;
        temps[2][3] = 78;
        temps[2][4] = 76;
        temps[2][5] = 73;
        temps[2][6] = 77;
        temps[3][0] = 64;
        temps[3][1] = 65;
        temps[3][2] = 69;
        temps[3][3] = 68;
        temps[3][4] = 70;
        temps[3][5] = 74;
        temps[3][6] = 72;
        String time[] = {"7:00 AM: ", "3:00 PM: ", "7:00 PM: ", "3:00 AM: "};
        out.println("*****Temperature Calculator*****");
        out.println(" The data provided are: ");
        for(int row = 0; row < 4; row++)
        {
            out.println();
            out.print(time[row]);
            for(int column = 0; column < 7; column++)
            {
                out.printf("%4d", temps[row][column]);
            }
        }
        out.println();
        out.println();
        out.println("Based on that data given, the following numbers are the average temperatures for the week!");
        int sunSum =0;
        int monSum =0;
        int tueSum =0;
        int wedSum =0;
        int thuSum =0;
        int friSum =0;
        int satSum =0;
        for (int row = 0; row < 4; row++)
        {
            sunSum += temps[row][0];
            monSum += temps[row][1];
            tueSum += temps[row][2];
            wedSum += temps[row][3];
            thuSum += temps[row][4];
            friSum += temps[row][5];
            satSum += temps[row][6];
        }
        int sunAvg = sunSum/4;
        int monAvg = monSum/4;
        int tueAvg = tueSum/4;
        int wedAvg = wedSum/4;
        int thuAvg = thuSum/4;
        int friAvg = friSum/4;
        int satAvg = satSum/4;
        int avgByDay[] = {sunAvg, monAvg, tueAvg, wedAvg, thuAvg, friAvg, satAvg};
        String weekDays[] = {"Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat"};
        for (int x = 0; x < avgByDay.length; x++)
        {
            out.println(weekDays[x] + " :  " + avgByDay[x]);
        }
        out.println();
        int sum7a = 0;
        int sum3p = 0;
        int sum7p = 0;
        int sum3a = 0;
        for (int column = 0; column < 7; column++)
        {
            sum7a += temps[0][column];
            sum3p += temps[1][column];
            sum7p += temps[2][column];
            sum3a += temps[3][column];
        }
        int avg7a = sum7a/7;
        int avg3p = sum3p/7;
        int avg7p = sum7p/7;
        int avg3a = sum3a/7;
        int avgByTime[] = {avg7a, avg3p, avg7p, avg3a};
        for (int x = 0; x < avgByTime.length; x++)
        {
            out.println(time[x] +  avgByTime[x]);
        }
        int totalSum = 0;
        for (int row = 0; row < 4; row++)
        {
            for (int column = 0; column < 7; column++)
            {
                totalSum +=  temps[row][column];
            }
        }
        int totalAverage = totalSum/28;
        out.println();
        out.println("The final average temperature for the week was: ");
        out.println(" Overall: " + totalAverage);
    }
}
