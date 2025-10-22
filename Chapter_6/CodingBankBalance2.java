package PracJava;


import java.util.Scanner;

public class CodingBankBalance2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double balance = 100.00;  // starting balance
        double interestRate = 0.03; // 3% interest
        int year = 1;
        int choice;

        do {
            // Calculate new balance
            balance = balance + (balance * interestRate);

            // Display result
            System.out.printf("After year %d at %.2f interest rate, balance is $%.4f%n",
                    year, interestRate, balance);

            // Ask user if they want to continue
            System.out.println();
            System.out.println("Do you want to see the balance at the end of another year?");
            System.out.print("Enter 1 for yes or any other number for no >> ");
            choice = input.nextInt();
            System.out.println();

            year++;

        } while (choice == 1);

        System.out.println("Program complete");
        input.close();
    }
}