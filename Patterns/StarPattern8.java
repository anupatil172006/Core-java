/*

*       *
* *   * *
* * * * *
* *   * *
*       *     

*/

import java.util.Scanner;
class StarPattern8
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of rows:");
		int n=sc.nextInt();
		int mid=n/2;
		for(int i=0;i<n;i++)
		{
			int st;
			if(i<=mid)
			{
				st=i+1;
			}
			else
			{
				st=n-i;
			}
			for(int j=0;j<st;j++)
			{
				System.out.print("* ");
			}
			int sp=n-2*st;
			for(int j=0;j<sp;j++)
			{
				System.out.print("  ");
			}
			int rStars=st;
			if(i==mid)
			{
				rStars=st-1;
			}
			for(int j=0;j<rStars;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
