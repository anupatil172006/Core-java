import java.util.Scanner;
class CurrencyConvertor 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		//infinite loop
		for(; ;)
		{
			System.out.println("\n WELCOME \n");
			System.out.println("\n ***** CURRENCY CONVERTOR *****");
			System.out.println("\n Enter the amount in INR:");
			double amount= sc.nextDouble();
			
			System.out.println("\n 1.USD \n2.KWD \n3.EUR \n4.GBP \n5.CAD \n6.AUD \n7.JPY \n8.LRD \n9.MYR \n10.NGN");
			System.out.println("Enter your response:");
			String resp=sc.next().toUpperCase();
			boolean assump=true;
			double convertedAmount=0;
			
			if(resp.equals("USD"))
			{
				convertedAmount=amount/90.21;
			}
			else if(resp.equals("KWD"))
			{
				convertedAmount=amount/293.61;
			}
			else if(resp.equals("EUR"))
			{
				convertedAmount=amount/106.53;
			}
			else if(resp.equals("GBP"))
			{
				convertedAmount=amount/123.41;
			}
			else if(resp.equals("CAD"))
			{
				convertedAmount=amount/65.95;
			}
			else if(resp.equals("AUD"))
			{
				convertedAmount=amount/63.39;
			}
			else if(resp.equals("JPY"))
			{
				convertedAmount=amount/0.57;
			}
			else if(resp.equals("LRD"))
			{
				convertedAmount=amount/0.48;
			}
			else if(resp.equals("MYR"))
			{
				convertedAmount=amount/22.95;
			}
			else if(resp.equals("NGN"))
			{
				convertedAmount=amount/0.06;
			}
			else
			{
				assump=false;
				System.out.println("INVALID CHOICE");
			}
			if(assump)
		{
			System.out.printf("%n%20.2f INR = %.2f %s%n",amount,convertedAmount,resp);
			
		}
		
		}
		
		
	}
}
