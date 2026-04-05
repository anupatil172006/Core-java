//Returns the sum of digits present in the number using the recursive approach

import java.util.Scanner;
class RecSumofDigits 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		int n=sc.nextInt();
		System.out.println("Sum of digits of "+n+" is "+sumOfDigits(n,0));
	}
	public static int sumOfDigits(int n,int sum)
	{
		/*if(n==0)
		{
			return sum;
		}
		return sumOfDigits(n/10,sum+=(n%10));//0,10*/
		return n==0?sum:sumOfDigits(n/10,sum+=(n%10));
	}
}
