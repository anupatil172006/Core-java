/*
    A
   A B
  A B C
 A B C D
A B C D E
 A B C D
  A B C
   A B
    A
*/

import java.util.Scanner;
class AbcdDiamond
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of rows:");
		int n=sc.nextInt();
		int space=n/2,pt=1;
		for(int i=0;i<n;i++)
		{
			char ch='A';
			for(int j=0;j<space;j++)
			{
				System.out.print(" ");
			}
			for(int k=0;k<pt;k++)
			{
				System.out.print(ch+" ");
				if(k<n/2)
				{
					ch++;
				}
				else
				{
					ch--;
				}
			}
		
			if(i<n/2)
			{
				space--;
				pt++;
				ch++;
			}
			else
			{
				space++;
				pt--;
				ch--;
			}
			System.out.println();
		}
	}
}
