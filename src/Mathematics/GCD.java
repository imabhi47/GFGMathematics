package Mathematics;

import java.util.Scanner;

public class GCD {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the two numbers");
		System.out.println("Enter first no");
		int a = sc.nextInt();
		System.out.println("Enter second number");
		int b = sc.nextInt();
		System.out.println("GCD is:" + getGCD(a, b));
	}

	public static int getGCD(int a, int b) {
		int result = Math.min(a, b);
		while (result > 0) {
			if (a % result == 0 && b % result == 0) {
				break;
			}
			result--;

		}
		return result;
	}
}