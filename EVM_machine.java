import java.util.Scanner;
class EVM_machine 
{
	static int bjp,aap,cong,mns,nota;
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the population:");
		int population=sc.nextInt();
		
		for(int i=1;i<=population;i++)
		{
			System.out.println("\n **** WELCOME ****");
			System.out.println("\n AAP KA EK VOTE DESH BADAL SAKTA HAI..!");
			System.out.println("\n1.BJP \n2.AAP \n3.CONG \n4.MNS \n5.NOTA");
			System.out.println("\n Enter your response:");
			String resp=sc.next().toUpperCase();
		
			if(resp.equals("BJP"))
			{
				bjp++;
				System.out.println("\nYou have voted for BJP");
				System.out.println("\n ACHHE DIN AYENGE\n");
			}
			else if(resp.equals("AAP"))
			{
				aap++;
				System.out.println("\n You have voted for AAP");
				System.out.println("\n AAP KA EK VOTE MUZE AZAD KAR SAKTA HAI");
			}
			else if(resp.equals("CONG"))
			{
				cong++;
				System.out.println("\n You have voted for CONG");
				System.out.println("\n BHARAT JODO");
			}
			else if(resp.equals("MNS"))
			{
				mns++;
				System.out.println("\n You have voted for MNS");
				System.out.println("\n JAI MAHARASHTRA");
			}
			else if(resp.equals("NOTA"))
			{
				nota++;
				System.out.println("\n You voted for NOTA");
				System.out.println("\n YOU ARE EDUCATED");
			}
			else
			{
				System.out.println("\n INVALID RESPONSE");
				i--;
			}
		}
						

		
		System.out.println("\nBJP:"+bjp);
		System.out.println("\nAAP:"+aap);
		System.out.println("\nCONG:"+cong);
		System.out.println("\nMNS:"+mns);
		System.out.println("\nNOTA:"+nota);
		
		if(bjp>=aap&&bjp>=cong&&bjp>=mns&&bjp>=nota)
		{
			System.out.println("BJP has won the elections by "+bjp+" votes");
		}
		else if(aap>=cong&&aap>=mns&&aap>=nota)
		{
			System.out.println("AAP has won the elections by "+aap+" votes");
		}
		else if(cong>=mns&&cong>=nota)
		{
			System.out.println("CONG has won the elections by "+cong+" votes");
		}
		else if(mns>=nota)
		{
			System.out.println("MNS has won the votes by "+mns+" votes");
		}
		else
		{
			System.out.println("NOTA has won the elections by "+nota+" votes");
		}
		/* String winner=(bjp>aap&&bjp>cong&&bjp>mns&&bjp>nota)?("BJP is winnwer"):(aap>cong&&aap>mns&&aap>nota)?("AAP is winner"):(cong>mns&&cong>nota)?("CONG is winner"):(mns>nota)?("MNS is winner"):("NOTA is winner");
		 System.out.println(+winner);*/
		
	}
}
