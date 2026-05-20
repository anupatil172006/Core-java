/*
         1
      2  3  2
   3  4  5  4  3
4  5  6  7  6  5  4
   3  4  5  4  3
      2  3  2
         1
*/

import java.util.Scanner;
class NumberPattern12  
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of rows:");
		int n=sc.nextInt();
		int sp=n/2,pt=1;
		for(int i=0;i<n;i++)
		{
			int num;
			if(i<=n/2)
			{
				num=i+1;
			}
			else
			{
				num=n-i;
			}
			for(int j=0;j<sp;j++)
			{
				System.out.print("  ");
			}
			for(int j=0;j<pt;j++)
			{
				System.out.print(num+" ");
				if(j<pt/2)
				{
					num++;
				}
				else
				{
					num--;
				}
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
