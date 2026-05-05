/*

*
* *
* * *
* *
*

*/
import java.util.Scanner;
class StarPattern7 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of rows:");
		int n=sc.nextInt();
		int sp=n/2,st=1;
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<st;j++)
			{
				System.out.print("* ");
			}
			for(int j=0;j<sp;j++)
			{
				System.out.print(" ");
			}
			if(i<n/2)
			{
				st++;
				sp--;
			}
			else
			{
				st--;
				sp++;
			}
			System.out.println();
		}
	}
}
