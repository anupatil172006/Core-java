//Returns the reverse of the number entered by the user using recursive approach

import java.util.Scanner;
class ReverseOfNumber
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		int n=sc.nextInt();
		System.out.println("Reverse of "+n+" is "+reverse(n,0));
	}
	public static int reverse(int n, int rev)
	{
		/*if(n==0)
		{
			return rev;
		}
		return reverse(n/10,rev*10+(n%10));*/
		return n==0?rev:reverse(n/10,rev*10+(n%10));	
	}
}
