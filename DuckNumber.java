//The number having at least one digit as 0 is called as Duck number
//E.g., 1023, 12340,1003,etc
//This program checks whether the number entered by the user is a Duck number or not

import java.util.Scanner;
class DuckNumber 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		int n=sc.nextInt();
		int n1=n;
		boolean flag=false;
		while(n!=0)
		{
			int r=n%10;
			if(r==0)
			{
				flag=true;
				break;
			}
			n/=10;
		}
		if(flag==true)
		{
			System.out.println(n1+" is a Duck number");
		}
		else
		{
			System.out.println(n1+" is not a Duck number");
		}
		
	}
}
