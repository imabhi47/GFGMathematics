package Mathematics;

import java.util.Scanner;

public class zeroesFactorial {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		System.out.println("Trailing zeroes in the given factorial is:"+getZeroFact(n));
	}
	
	public static int getZeroFact(int num)
	{
		int fact=1;
		for(int i=2;i<=num;i++)
		{
			fact=fact*i;
		}
		System.out.println("Factorial is:"+fact);
		int result=0;
		while(fact%10==0)
		{
			result++;
			fact=fact/10;
		}
		return result;
	}

}
