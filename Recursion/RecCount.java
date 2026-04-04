//Returns the count of digits present in the number using recursive approach

import java.util.Scanner;
class RecCount 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=sc.nextInt();
		System.out.println("Count of digits in "+n+" is "+countOfDigits(n,0));
	}
	public static int countOfDigits(int n,int ct)
	{
		/*int count=0;
		if(n==0)
		{
			return ct;
		}
		return countOfDigits(n/10,ct+1);*/
		
		return n==0?ct:countOfDigits(n/10,ct+1);
	}
}
