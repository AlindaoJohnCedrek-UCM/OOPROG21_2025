package PracJava;

import java.util.Scanner;

public class CodingBankBalanceByRateAndYear {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		final int NUM_YEARS = 4;

		final double[] RATES_TO_TEST = { 0.02, 0.03, 0.04, 0.05 };

		System.out.print("Enter initial bank balance > ");

		double initialBalance = input.nextDouble();

		for (double startingRate : RATES_TO_TEST) {

			double currentBalance = initialBalance;

			System.out.printf("\nWith an initial balance of $%.1f at an interest rate of %.2f%n", initialBalance,
					startingRate);

			for (int year = 1; year <= NUM_YEARS; year++) {

				currentBalance = currentBalance * (1 + startingRate);

				System.out.printf("After year %d balance is $%.4f%n", year, currentBalance);
			}
		}

		input.close();
		System.out.println("\n--- Operation complete");
	}

}
