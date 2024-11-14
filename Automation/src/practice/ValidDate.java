package practice;

import java.util.Scanner;

public class ValidDate {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        System.out.print("Enter day: ");
        int day = scanner.nextInt();

        System.out.print("Enter month: ");
        int month = scanner.nextInt();

        System.out.print("Enter year: ");
        int year = scanner.nextInt();

        if (isValidDate(day, month, year)) {
            System.out.println("The date is valid.");
        } else {
            System.out.println("The date is not valid.");
        }

        scanner.close();
	}

	private static boolean isValidDate(int day, int month, int year) {
	
		return false;
	}

}
