/*

   *
  * *
 * * *
* * * *
 * * *
  * *
   *
   
*/


import java.util.Scanner;
class StarDiamond 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of rows:");
		int n= sc.nextInt();
		int space=n/2,star=1;
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<space;j++)//0<3
			{
				System.out.print(" ");
			}
			for(int k=0;k<star;k++)//0
			{
				System.out.print("* ");
			}
			if(i<n/2)
			{
				star++;
				space--;
			}
			else
			{
				star--;
				space++;
			}
			System.out.println();
		}
	}
}
