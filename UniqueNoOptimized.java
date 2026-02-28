//Unique number optimized version

import java.util.Scanner;
class UniqueNoOptimized
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		int num=sc.nextInt();
		int temp=num;
		while(temp!=0)
		{
			int digit=temp%10;
			int n=temp/10;
			while(n!=0)
			{
				if(digit==n%10)
				{
					break;
				}
				n/=10;
			}
			if(n!=0)
			{
				break;
			}
			temp/=10;
		}
		if(temp==0)
		{
			System.out.println("Unique number");
		}
		else
		{
			System.out.println("Not a unique number");
		}
	}
}
