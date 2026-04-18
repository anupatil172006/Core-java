/*
  A
  ABC
 ABCDE
ABCDEFG
 ABCDE
  ABC
   A
*/

import java.util.Scanner;
class AbcPattern 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number of rows:");
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
				System.out.print(ch);
				ch++;
			}
			if(i<n/2)
			{
				space--;
				pt+=2;
			}
			else
			{
				space++;
				pt-=2;
			}
			System.out.println();
		}
	}
}
