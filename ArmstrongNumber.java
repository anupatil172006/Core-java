import java.util.Scanner;
class ArmstrongNumber 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		int n=sc.nextInt();
		int orignal=n;
		int temp=n;
		int digits=0,sum=0;
		//For counting the digits
		while(temp!=0)
		{
			digits++;
			temp=temp/10;
		}
		
		temp=n;
		
		while(n!=0)
		{
			int r=n%10;
			sum=sum+(int)Math.pow(r,digits);
			n=n/10;
		}
		if(sum==orignal)
		{
			System.out.println(orignal+ " is an Armstrong number");
		}
		else
		{
			System.out.println(orignal+" is not an Armstrong number");
		}
		
	}
}
