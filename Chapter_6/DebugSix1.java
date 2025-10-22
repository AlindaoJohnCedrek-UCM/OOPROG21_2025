package PracJava;
// Start with a penny
// Double it every day
// How much do you have in x number of days?

import java.util.Scanner;

public class DebugSix1 {
    public static void main(String[] args) 
    {
        Scanner keyboard = new Scanner(System.in);
        int days;
        double money = 0.01;  // Start with one penny
        int day = 1;

        System.out.print("Enter number of days >> ");
        days = keyboard.nextInt();

        while (day <= days) // loop for each day
        {
            System.out.println("After day " + day +
                    " you have $" + String.format("%.2f", money));
            money = money * 2; // double the amount each day
            ++day;
        }
    }
}