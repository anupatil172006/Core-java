//Neon number: n=9 sqr=9*9=81 8+1=9 
// By taking the square of the number and adding it's digits. If the sum of the digits is equals to the entered number then number is Neon number 
//This program checks whether the number entered by the user is Neon number or not

import java.util.Scanner;
class NeonNumber 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		int n=sc.nextInt();
		int sqr=1;
		int n1=n;
		int sum=0;
		sqr=n*n;
		while(sqr!=0)
		{
			int r=sqr%10;
			sum+=r;
			sqr=sqr/10;
		}
		if(n1==sum)
		{
			System.out.println(n1+" is a Neon number");
		}
		else
		{
			System.out.println(n1+" is not a Neon number");
		}
	}
}
