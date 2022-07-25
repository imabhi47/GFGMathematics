package Mathematics;

import java.util.Scanner;

public class LCM {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two numbers");
		System.out.println("Enter 1st number");
		int a = sc.nextInt();
		System.out.println("Enter 2nd number");
		int b = sc.nextInt();
		System.out.println("LCM of two nos is:" + getLCM(a, b));

	}

	public static int getLCM(int a, int b) {
		int result = Math.max(a, b);
		while (true) {
			if (result % a == 0 && result % b == 0) {
				break;
			}
			result++;
		}
		return result;

	}
}
