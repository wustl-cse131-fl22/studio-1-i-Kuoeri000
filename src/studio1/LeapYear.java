package studio1;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter a year: ");
		int year = in.nextInt();
		boolean divisibleByFour = year % 4 == 0;
		boolean divisibleByHundred = year % 100 != 0;
		boolean exception = year % 400 == 0;
		
		boolean isLeapYear = (divisibleByFour = divisibleByHundred = exception);
		
		System.out.println(year + " is a leap year: " + isLeapYear);
		

	}

}
