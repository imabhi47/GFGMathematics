package Mathematics;

import java.util.Scanner;

public class Prime {

	public static void main(String[] args) {
		System.out.println("Enter a number");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		if (isPrime(num)) {
			System.out.println("Given number" + num + "is prime");
		} else {
			System.out.println("Given number" + num + " is not prime");
		}

	}

	public static boolean isPrime(int n) {
		if (n == 0 || n == 1) {
			return false;
		}
		for (int i = 2; i < n; i++) {
			if (n % i == 0) {
				return false;
			}

		}
		return true;
	}
}
