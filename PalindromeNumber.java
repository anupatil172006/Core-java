import java.util.Scanner;
class PalindromeNumber 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		int n=sc.nextInt();
		int n1=n,rev=0;
		while(n!=0)
		{
			int r=n%10;
			rev=rev*10+r;
			n=n/10;
		}
		if(n1==rev)
		{
			System.out.println(n1+" is a palindrome");
		}
		else
		{
			System.out.println(n1+" is not a palindrome");
		}
	}
}
