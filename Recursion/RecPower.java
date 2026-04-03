import java.util.Scanner;
class RecPower 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter base value:");
		int n=sc.nextInt();
		System.out.println("Enter raise value:");
		int r=sc.nextInt();
		System.out.println("Power of "+n+" is "+powerOfNumber(n,r));
	}
	public static int powerOfNumber(int base,int raise)
	{
		/*if(raise==0)
		{
			return 1;
		}
		else
		{
			return base*powerOfNumber(base,raise-1);
		}*/
		return raise==0?1:base*powerOfNumber(base,raise-1);
	}
}
