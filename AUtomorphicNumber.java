//last number of the square of the number must be same as the number
// EX.: 25*25=625 i.e 625 contains the 25 hence 625 is the automorphic number


import java.util.Scanner;
class AutomorphicNumber 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		int num=sc.nextInt();
		int pow=1;
		for(int i=num;i!=0;i/=10)
		{
			pow*=10;
		}
		int sqr=num*num;
		if(sqr%pow==num)
		{
			System.out.println(num+" is a Automorphic number");
		}
		else
		{
			System.out.println(num+" not a automorphic number");
		}
	}
}
