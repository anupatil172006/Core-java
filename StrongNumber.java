//input number:145 strong number means 145=1!+4!+5!
//This program checks whether the number entered by the user is a strong number or not

import java.util.Scanner;
class StrongNumber 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		int n=sc.nextInt();
		int  temp=n,sum=0;
		while(n!=0)
		{
			int r=n%10;
			int i=1;
			int fact=1;
			while(i<=r)
			{
				
				fact=fact*i;
				i++;
			}
				sum+=fact;
				n=n/10;
		}
		if(sum==temp)
		{
			System.out.println(temp+" is a Strong number");
		}
		else
		{
			System.out.println(temp+" is not a Strong number");
		}
			
		}
	}
