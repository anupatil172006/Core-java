/*
* * * * * * *
  * * * * *
    * * *
	  *
	* * *
  * * * * *
* * * * * * *
*/

import java.util.Scanner;
class StarPattern9 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of rows:");
		int n=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			int st=0;
			int sp=0;
			if(i<n/2)
			{
				st=n-(2*i);
				sp=n-(st+i);
			}
			else
			{
				st=2*(i-(n/2))+1;
				sp=n-i-1;
			}
			
			for(int j=0;j<sp;j++)
			{
				System.out.print("  ");
			}
			for(int j=0;j<st;j++)
			{
				System.out.print("* ");
			}
			System.out.println();	
		}
		
	}
}
