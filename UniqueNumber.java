//The number which dosen't contains any repeated digits in it, called as Unique number

import java.util.Scanner;
class UniqueNumber 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		int num=sc.nextInt();
		boolean unique=true;
		for(int i=num;i!=0;i/=10)
		{
			int rem=i%10;
			for(int j=i/10;j!=0;j/=10)
			{
				if(rem==j%10)
				{
					unique=false;
					break;
				}
			}
		}
		if(!unique)
		{
			System.out.println("not a unique number");
		}
		else
		{
			System.out.println("Unique number");
		}
		
	}
}
