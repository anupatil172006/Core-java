import java.util.Scanner;
class ArmstrongNo 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		int n=sc.nextInt();
		int ct=0,temp=n,sum=0;
		for(int i=n;i!=0;i/=10)
		{
			ct++;
		}
		while(n!=0)
		{
			int last=n%10;
			int pow=1;
			for(int i=0;i<ct;i++)
			{
				pow*=last;
			}
			n/=10;
			sum+=pow;
		}
		if(sum==temp)
		{
			System.out.println(temp+" is armstrong number");
		}
		else
		{
			System.out.println(temp+" is not a Armstrong number");
		}
	}
}
