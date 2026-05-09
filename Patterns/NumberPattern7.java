import java.util.Scanner;
class NumberPattern7 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of rows:");
		int n=sc.nextInt();
		int num=1;
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(j<n-1-i)
				{
					System.out.print(" ");
				}
				else
				{
					System.out.print(num);
					num++;
				}
			}
			System.out.println();
			num=1;
		}
	}
}
