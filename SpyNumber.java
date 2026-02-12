//Spy number: E.g.:1124-> 1+1+2+4=8 & 1*1*2*4=8 
//If the output of multiplication and additition of digits from the number is same then the number will be called as Spy number
//This program checks whether the number entered by the user is Spy number or not

import java.util.Scanner;
class SpyNumber 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		int n=sc.nextInt();
		int sum=0;
		int mul=1;
		int n1=n;
		while(n!=0)
		{
			int r=n%10;
			sum+=r;
			mul*=r;
			n=n/10;
		}
		if(sum==mul)
		{
			System.out.println(n1+" is a Spy number");
		}
		else
		{
			System.out.println(n1+" is not a Spy number");
		}
	}
}
