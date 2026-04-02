//Returns the factorial of the program using the recursive approach

import java.util.Scanner;
class Factorial 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		int n=sc.nextInt();
		System.out.println("Factorial of " +n+" is " +factorial(n));
	}
	public static int factorial(int n)
	{
		return n==0?1:n*factorial(n-1);
	}
}
