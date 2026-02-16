import java.util.Scanner;
class GcdOfNumber 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 1st number:");
		int n1=sc.nextInt();
		System.out.println("Enter 2nd number:");
		int n2=sc.nextInt();
		int gcd=0;
		int small=n1<n2?n1:n2;
		for(int i=1;i<=small;i++)
		{
			if(n1%i==0 && n2%i==0)
			{
				gcd=i;
			}
		}
		System.out.println("Greatest common factor of "+n1+" & "+n2+" is: "+gcd);
	}
}
