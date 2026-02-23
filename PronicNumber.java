//The pronic number is which has a consecutive numbers as a multiplicants
//E.x.: 20=4*5, 6=3*2

import java.util.Scanner;
class PronicNumber 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		int num=sc.nextInt();
		for(int i=0; ;i++)
		{
			if(i*(i+1)==num)
			{
				System.out.println(num+" is a Pronic number");
				break;
			}
			else if(i*(i+1)>num)
			{
				System.out.println(num+" is not a pronic number");
				break;
			}
		}
	}
}
