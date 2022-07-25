package Mathematics;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		System.out.println("Factorail of a given number is:"+getFactorial(n));
	}

	public static int getFactorial(int num)
	{
		int fact=1;
		for(int i=2;i<=num;i++)
		{
			fact=fact*i;
		}
		return fact;
		
	}
}
