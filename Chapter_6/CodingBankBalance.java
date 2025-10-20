package PracJava;

import java.util.*;

class CodingBankBalance {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		final double INTEREST_RATE = 0.03;
		double currentBalance = 0;
		int year = 0;
		boolean validInput = false;

		while (!validInput) {
			try {
				System.out.print("Enter initial bank balance > ");
				currentBalance = input.nextDouble();

				if (currentBalance <= 0) {
					System.out.println("Balance must be positive.");
				} else {
					validInput = true;
				}
			} catch (InputMismatchException e) {
				System.out.println("Invalid input! Please enter a numeric value.");
				input.next();
			}
		}

		boolean continueCalculating = true;

		while (continueCalculating) {

			year++;
			currentBalance *= (1 + INTEREST_RATE);

			System.out.printf("After year %d at %.2f interest rate, balance is $%.1f%n", year, INTEREST_RATE,
					currentBalance);

			int choice = 0;
			boolean validChoice = false;

			while (!validChoice) {
				try {

					String prompt = (year == 1) ? "\nDo you want to see next year's balance?"
							: "\nDo you want to see the balance at the end of another year?";
					System.out.println(prompt);

					System.out.print("Enter 1 for yes   or any other number for no >> ");
					choice = input.nextInt();
					validChoice = true;

					if (choice != 1) {
						continueCalculating = false;
					}

				} catch (InputMismatchException e) {
					System.out.println("Invalid choice! Please enter '1' or another number.");
					input.next();
				}
			}
		}

		input.close();
		System.out.println("\n---jGRASP: Operation complete.");
	}

}
