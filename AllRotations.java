//Prints all possible rotations of the number entered by the user

import java.util.Scanner;
class AllRotations 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		int num=sc.nextInt();
		int pow=1,temp=num;
		while(temp>9)
		{
			pow*=10;
			temp/=10;
		}
		int ans=num;
		while(true)
		{
			int last=ans%10;
			ans=last*pow+(ans/10);
			
			if(ans==num)
			{
				break;
			}
			System.out.println(ans);
		}
	}
}
