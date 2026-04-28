/*
       1
     1 2 1
   2 3 4 3 2
 3 4 5 6 5 4 3
*/

import java.util.Scanner;
class NumberPattern3 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("ENter the number of rows:");
		int n=sc.nextInt();
		int num=1;
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n+i;j++)
			{
				if(j<n-1-i)
				{
					System.out.print("  ");
				}
				else
				{
					if(j<(n*2)/2-1)
					{
						System.out.print(" "+num);
						num++;
					}
					else
					{
						System.out.print(" "+num);
						num--;
					}
				}
			}
			System.out.println();
			num=i+1;
		}
	}
}
