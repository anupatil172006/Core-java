import java.util.Scanner;
class PerfectNumber 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		int n=sc.nextInt();
		int sum=0,prod=1;
		while(n!=0)
		{
			sum+=(n%10);
			prod*=(n%10);
			n/=10;
		}
	    if(sum==prod)
		{
			System.out.println("Perfect number");
		}
		else{
			System.out.println("Not a perfect number");
		}
	}
}
