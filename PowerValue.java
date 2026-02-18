import java.util.Scanner;
class PowerValue 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the base value:");
		int base=sc.nextInt();
		System.out.println("Enter the power value:");
		int power=sc.nextInt();
		int i=1;
		int result=1;
		while(i<=power)
		{
			result=result*base;
			i++;
		}
		System.out.println(result);
	}
}
