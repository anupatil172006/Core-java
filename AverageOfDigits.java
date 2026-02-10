//It calculates the average of digits of number entered by the user

import java.util.Scanner;
class AverageOfDigits 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		int n=sc.nextInt();
		int n1=n;
		double sum=0;
		int count=0;
		do
		{
			int r=n%10;
			sum=sum+r;
			count++;
			n=n/10;
		}while (n!=0);
		double avg=sum/count;
		System.out.println("Average of "+n1+" is "+avg);
	}
}
