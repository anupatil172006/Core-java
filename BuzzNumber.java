//Buzz number: a number which is divisible by or ends with 0
//This program checks whether the number entered by the user is Buzz number or not

import java.util.Scanner;
class BuzzNumber 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		int n=sc.nextInt();
	
			int r=n%10;
			if(r==7||r%7==0)
			{
				System.out.println(n+" is a Buzz number");
			}
			else
			{
				System.out.println(n+" is not a Buzz number");
			}
			
	}
}
