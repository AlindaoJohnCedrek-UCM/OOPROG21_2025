package PracJava;

import java.util.Scanner;

public class Payroll {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter employee number: ");
		int empNum = input.nextInt();

		System.out.print("How many hours did you work this week? ");
		double hoursWorked = input.nextDouble();

		System.out.print("What is your regular pay rate? ");
		double payRate = input.nextDouble();

		Employee emp = new Employee(empNum, payRate);

		double regularPay = emp.computeRegularPay(hoursWorked);
		double overtimePay = emp.computeOvertimePay(hoursWorked);

		System.out.println("\n--- PAYROLL SUMMARY ---");
		System.out.println("Employee Number: " + emp.getEmployeeNumber());
		System.out.println("Hours Worked: " + hoursWorked);
		System.out.println("Regular Pay: " + regularPay);
		System.out.println("Overtime Pay: " + overtimePay);

		input.close();
	}
}
