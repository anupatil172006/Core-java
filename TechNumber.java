//Tech number: dividing the number into half. adding both of the halfs and squaring the sum. if the squared number and entered number is same then the number is tech number.
//e.g., 2025-> firstHalf=20 LastHalf=25 sum=20+25=45 sqr=45*45=2025

import java.util.Scanner;
class TechNumber
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		int num=sc.nextInt();
		int ct=0,pow=1,n=num;
		for(int i=num;i!=0;i/=10)
		{
			ct++;
		}
		if(ct%2==0)
		{
			for(int j=1;j<=ct/2;j++)
			{
				pow*=10;
			}
			int FirstHalf=n/pow;
			int LastHalf=n%pow;
			int tot=FirstHalf+LastHalf;
			int sqr=tot*tot;
			if(sqr==num)
			{
				System.out.println(num+" is a Tech number");
			}
			else
			{
				System.out.println(num+" is not a Tech number");
			}
		}
		else
		{
			System.out.println(num+" is not a tech number");
		}
	}
}
