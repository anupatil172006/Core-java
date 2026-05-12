/*
       1
    2     2
 3           3
    4     4
       5
*/

import java.util.Scanner;
class NumberPattern9 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number of rows:");
		int n=sc.nextInt();
		int left=n/2,right=n/2,num=1;
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(j==left||j==right)
				{
					System.out.print(" "+num+" ");
				}
				else
				{
					System.out.print("   ");
				}
			}
			if(i<n/2)
			{
				left--;
				right++;
			}
			else
			{
				left++;
				right--;
			}
			System.out.println();
			num++;
		}
	}
}
