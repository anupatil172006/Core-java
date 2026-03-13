import java.util.Scanner;
class LoanCalculator 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		for(; ;)
		{
			System.out.println("\n ***** WELCOME *****");
			System.out.println("Amount:");
			double amount=sc.nextDouble();
			if(amount<1000 || amount>100000)
			{
				System.out.println("\n INVALID AMOUNT\n");
				continue;
			}
			System.out.println("Rate of INterest:");
			double interest=sc.nextDouble();
			if(interest<1 || interest>30)
			{
				System.out.println("INVALID interest");
				continue;
			}
			System.out.println("Tenure(months):");
			int tenure=sc.nextInt();
			if(tenure<3 || tenure>36)
			{
				System.out.println("INVALID  tenure");
				continue;
			}
			 double perMonthAmount=(amount/100)*interest;
			 double totalInterestAmount=perMonthAmount*tenure;
			 double emi=(amount+totalInterestAmount)/tenure;
			 double totalAmount=amount+totalInterestAmount;
			 
			 System.out.println("\nMonthly EMI: "+emi);
			 System.out.println("Principal Amount: "+amount);
			 System.out.println("total interest: "+totalInterestAmount);
			 System.out.println("total Amouunt: "+totalAmount);
		}
	}
}
