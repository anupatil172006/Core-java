//This program returns the biggest digit from the user entered number

import java.util.Scanner;
class BiggestDigit 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=sc.nextInt();
		int big=0;
		while(n!=0)
		{
			int r=n%10;
			if(r>big)
			{
				big=r;
			}
			n=n/10;
		}
		System.out.println("Biggest digit is: "+big);
	}
}
