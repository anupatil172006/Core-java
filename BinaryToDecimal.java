import java.util.Scanner;
class BinaryToDecimal 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any binary number:");
		int n=sc.nextInt();
		int temp=n;
		int sum=0,a=1;
		while(n!=0)
		{
			int r=n%10;
			sum=sum+r*a;
			a=a*2;
			n=n/10;
		}
		System.out.println("Decimal of "+temp+" is: "+sum);
	}
}
