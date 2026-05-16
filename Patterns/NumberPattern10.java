/*
         1
      2  3  4
   5  6  7  8  9
10 11 12 13 14 15 16
   17 18 19 20 21
      22 23 24
         25
*/

import java.util.Scanner;
class NumberPattern10 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of rows:");
		int n=sc.nextInt();
		int sp=n/2,num=1,pt=1;
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<sp;j++)
			{
				System.out.print("   ");
			}
			for(int j=0;j<pt;j++)
			{
				if(num<10)
				{
					System.out.print(num+"  ");
				}
				else
				{
					System.out.print(num+" ");
				}
				
				num++;
			}
			if(i<n/2)
			{
				sp--;
				pt+=2;
			}
			else
			{
				sp++;
				pt-=2;
			}
			System.out.println();
		}
	}
}
