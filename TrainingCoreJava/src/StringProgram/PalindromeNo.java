package StringProgram;

import java.util.Scanner;

public class PalindromeNo {

	public static void main(String[] args) {

		//
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any no.:");
		int num = sc.nextInt();

		int org_num = num;
		int rev = 0;
		while (num != 0) {
			rev = rev * 10 + num % 10;

		}

	}

}
