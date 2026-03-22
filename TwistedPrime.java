import java.util.Scanner;
class TwistedPrime 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		int num=sc.nextInt();
		if(isPrime(num)&&isPrime(reverse(num)))
		{
			System.out.println(num+" is a Twisted prime number");
		}
		else
		{
			System.out.println(num+" is not a twisted prime number");
		}
	}
	public static boolean isPrime(int num)
	{
		int den=2;
		while(den<num)
		{
			if(num%den==0)
			{
				break;
			}
			den++;
		}
		return den==num;
	}
	public static int reverse(int num)
	{
		int rev=0;
		while(num!=0)
		{
			rev=rev*10+(num%10);
			num/=10;
		}
		return rev;
	}
}
