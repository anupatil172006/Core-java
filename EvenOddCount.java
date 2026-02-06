import java.util.Scanner;
class EvenOddCount 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		int num=sc.nextInt();
		int Ecount=0,Ocount=0;
		do
		{
			int r=num%10;
			if(r%2==0)
			{
				Ecount++;
			}
			else
			{
				Ocount++;
			}
			num=num/10;
		}while (num!=0);
		
		
		System.out.println("Even number count: "+Ecount);
		System.out.println("Odd number count: "+Ocount);
	}
}
