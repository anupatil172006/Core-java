//This program returns how many times the digits has occured in the number

import java.util.Scanner;
class FrequencyOfDigits 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		int num=sc.nextInt();
		frequencyCount(num);
	}
	public static void frequencyCount(int n)
	{
		for(int i=0;i<=9;i++)
		{
			int ct=0,temp=n;
			while(temp!=0)
			{
				int r=temp%10;
				if(i==r)
				{
					ct++;
				}
				temp/=10;
					
			}
				if(ct>0)
			{
				System.out.println(i+" --> "+ct);
			}
		}
	}
}
