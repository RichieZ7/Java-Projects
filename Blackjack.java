import java.util.Random;
import java.util.Scanner;

public class Blackjack
{

	public static void main ( String[] args )
	{
		Scanner keyboard = new Scanner ( System.in );
		Random r = new Random();
		int draw1 = r.nextInt(10) + 2;
		int draw2 = r.nextInt(10) + 2;
		int draw3 = r.nextInt(10) + 2;
		int draw4 = r.nextInt(10) + 2;
		int total = draw1 + draw2;
		int computerTotal = draw3 + draw4;
		int hit = 0;
		String choice = "hit";
		System.out.println("BLACKJACK");
		System.out.println("You get " + draw1 + " and " + draw2 + ".");
		System.out.println("Your total is " + total + ".");
		System.out.println();
		System.out.println("The dealer has a " + draw3 + " showing, and a hidden card.");
		System.out.println("His total is hidden too.");
		System.out.println();
		while ( choice.equals("hit") && total <= 21 )
		{
			System.out.print("Would you like to \"hit\" or \"stay\"? ");
			choice = keyboard.nextLine();
			if ( choice.equals("hit") )
			{
				hit = r.nextInt(10) + 2;
				total = total + hit;
				System.out.println("You drew " + hit + ".");
				System.out.println("Your total is " + total + ".");
				System.out.println();
			}
			else
			{
				System.out.println();
			}
		}
		if ( total > 21 ) 
		{
			System.out.println("You bust!");
			System.out.println("Dealer wins!");
		}
		while ( choice.equals("stay") && computerTotal <= 21 && total <= 21)
		{
			if ( computerTotal == draw3 + draw4 )
			{
				System.out.println("Okay dealer's turn.");
				System.out.println("His hidden card was a " + draw4 + ".");
			}
			System.out.println();
			if ( computerTotal <= 16 )
			{
				hit = r.nextInt(10) + 2;
				computerTotal = computerTotal + hit;
				System.out.println("Dealer chooses to hit.");
				System.out.println("He draws a " + hit + ".");
				System.out.println("His total is " + computerTotal + ".");
				System.out.println();
			}
			else if ( computerTotal > 16 && computerTotal <= 21 )
			{
				System.out.println("Dealer stays.");
				System.out.println();
				break;
			}
			
		}
		if ( computerTotal > 21 )
		{	
			System.out.println("Dealer busts!");
			System.out.println("You win!");
		}
		if( computerTotal <= 21 && total <= 21)
		{
			System.out.println("Dealer total is " + computerTotal + ".");
			System.out.println("Your total is " + total + ".");
			System.out.println();
			if ( computerTotal == total )
			{
				System.out.println("It's a tie!");	
				System.out.println("Dealer wins by default!");
			}
			else if ( computerTotal > total )
			{
				System.out.println("Dealer wins!");
			}
			else if ( total > computerTotal )
			{
				System.out.println("You win!");
			}
		}
	}
}
			
			



