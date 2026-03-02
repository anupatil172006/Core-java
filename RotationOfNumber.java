//Performs one rotation on number entered by the user

import java.util.Scanner;
class RotationOfNumber 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		int num=sc.nextInt();
		int pow=1,n=num;
		int temp=num;
		int rem=n%10;
		num/=10;
		n/=10;
		while(n!=0)
		{
			n/=10;
			pow*=10;
		}		
		rem=rem*pow;
		num=num+rem;
		System.out.println("Rotation of "+temp+" is "+num);
		
	}
}
