//This program converts any octal number into decimal number

import java.util.Scanner;
class OctalToDecimal 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any Octal number:");
		int n=sc.nextInt();
		int sum=0,a=1;
		int temp=n;
		while(n!=0)
		{
			int r=n%10;
			sum=sum+r*a;
			a=a*8;
			n=n/10;
		}
		System.out.println("Decimal of "+temp+" is: "+sum);
	}
}
