//Prints the table of user entered number

import java.util.Scanner;
class Tables 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number:");
		int n=sc.nextInt();
		int i=1;
		while(i<=10)
		{
			int tab=n*i;
			System.out.println(n+" X "+i+" = "+tab);
			i++;
		}
	}
}
