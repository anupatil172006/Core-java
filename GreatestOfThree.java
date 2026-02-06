import java.util.Scanner;
class GreatestOfThree 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 3 numbers:");
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		int n3=sc.nextInt();
		int big=(n1>n2)?n1:n2;
		big=(big>n3)?big:n3;
		System.out.println("Greater number is: "+big);
		
		
	}
}
