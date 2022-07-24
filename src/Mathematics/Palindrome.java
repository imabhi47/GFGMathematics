package Mathematics;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		System.out.println("Enter a number");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		if (isPalindrome(num)) {
			System.out.println("Given number " + num + " is a Palindrome");
		} else {
			System.out.println("Given number " + num + " is not a palindrome");
		}

	}

	public static boolean isPalindrome(int num) {
		int rev = 0;
		int temp = num;
		while (temp != 0) {
			int remainder = temp % 10;
			rev = rev * 10 + remainder;
			temp = temp / 10;
		}
		if (rev == num) {
			return true;
		}
		return false;
	}

}
