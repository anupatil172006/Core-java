/*
1
2 3
4 5 6
7 8 9 10
*/

import java.util.Scanner;
class NumberPattern1
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number of rows:");
		int n=sc.nextInt();
		int num=1;
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(j<i)
				{
					System.out.print(num+" ");
					num++;
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
