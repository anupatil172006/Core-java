//This program adds the smallest and the biggest digit of the number entered by the user (this program will not work accurately for single digit)

import java.util.Scanner;
class BiggestSmallestSum 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		int n=sc.nextInt();
		int big=-9;
		int small=9;
		while(n!=0)
		{
			int r=n%10;
			if(r>big)
			{
				big=r;
			}
			if(r<small)
			{
				small=r;
			}
			n=n/10;
		}
		System.out.println("Sum of "+big+" & "+small+" is "+(big+small));
	}
}
