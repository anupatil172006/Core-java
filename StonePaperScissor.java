import java.util.Scanner;
class StonePaperScissor 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		infiniteLoop:
			for(; ;)
		    {
			    System.out.println("***** WELCOME *****");
				//user implementation
				System.out.println("1.STONE \n2.PAPER \n3.SCISSOR");
				System.out.println("Enter your response:");
				int dgtUser=sc.nextInt();
				String user="";
				if(dgtUser==1) user="STONE";
				else if(dgtUser==2) user="PAPER";
				else if(dgtUser==3) user="SCISSOR";
				else
				{
					System.out.println("INVALID RESPONSE");
					continue infiniteLoop;
				}
				
				//Bot implementation
				int dgtBot=0;
				String bot="";
				for(; ;)
				{
					dgtBot=(int)(Math.random()*10);
					if(dgtBot>=1 && dgtBot<=3)
					{
						break;
					}
				}
					
					if(dgtBot==1) bot="STONE";
					else if(dgtBot==2) bot="PAPER";
					else bot="SCISSOR";
				 
					
					System.out.printf("%n%10s %8s","BOT","USER");
					System.out.printf("%n%10s %8s",bot,user);
					
					//calculating winner
					if(bot.equals("STONE")&&user.equals("PAPER")||
						(bot.equals("PAPER")&&user.equals("SCISSOR"))||
						(bot.equals("SCISSOR")&&user.equals("STONE")))
					{
						System.out.println("\n*** USER WON ***");
					}
					else if(bot.equals("STONE")&&user.equals("SCISSOR")||
						(bot.equals("PAPER")&&user.equals("STONE"))||
						(bot.equals("SCISSOR")&&user.equals("PAPER")))
					{
						System.out.println("\n*** BOT WON ***");
					}
					else
					{
						System.out.println("\n*** ITS DRAW ***");
					}
				
				
		    }
		
	}
}
