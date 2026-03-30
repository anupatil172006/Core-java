//By adding the digits of the number, if the sum is a single digit value and equals to 1 then the number is called as the magic number
//eg.,55 --> 5+5=10 --> 1+0=1 therefore 55 is the magic number

import java.util.Scanner;
class MagicNumber 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		int n=sc.nextInt();
		if(isMagic(n))
		{
			System.out.println(n+" is a Magic number");
		}
		else
		{
			System.out.println(n+" is not a Magic number");
		}
	}
	public static boolean isMagic(int n)
	{
		int sum=sumOfDigits(n);
		while(sum>=9)
		{
			sum=sumOfDigits(sum);
		}
		return sum==1;
	}
	public static int sumOfDigits(int n)
	{
		int sum=0;
		while(n!=0)
		{
			int r=n%10;
			sum+=r;
			n/=10;
		}
		return sum;
	}
}
