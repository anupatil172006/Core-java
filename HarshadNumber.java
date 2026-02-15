//Harshad number: i/p-> 18 18/(1+8)=0
// Dividing the number by the addition of digits of it's own. If the remainder is ) the the number is Harshad number
//This program checks whether the number entered by the user is a Harshad number or not

import java.util.Scanner;
class HarshadNumber 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		int n=sc.nextInt();
		int sum=0;
		int n1=n;
		while(n!=0)
		{
			int r=n%10;
			sum+=r;
			n=n/10;
		}
		if(n1%sum==0)
		{
			System.out.println(n1+" is a Harshad number");
		}
		else
		{
			System.out.println(n1+" is not a Harshad number");
		}
	}
}
