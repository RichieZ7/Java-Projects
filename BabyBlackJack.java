import java.util.Random;
import java.util.Scanner;

public class BabyBlackJack
{
	public static void main ( String[] args )
	{
		Scanner keyboard = new Scanner ( System.in);
		Random r = new Random();
		System.out.println("Baby Blackjack!");
		System.out.println();
		int draw1 = r.nextInt(10) + 1;
		int draw2 = r.nextInt(10) + 1;
		int draw3 = r.nextInt(10) + 1;
		int draw4 = r.nextInt(10) + 1;
		System.out.println("You drew " + draw1 + " and " + draw2 + ".");
		System.out.println("Your total is " + (draw1 + draw2) + ".");
		System.out.println();
		System.out.println("The dealer has " + draw3 + " and " + draw4 + ".");
		System.out.println("Dealer's total is " + (draw3 + draw4) + ".");
		System.out.println();
		if( (draw1 + draw2) > (draw3 + draw4) )
		{
			System.out.println("YOU WIN!");
		}
		else if ( (draw1 + draw2) == (draw3 + draw4) )
		{
			System.out.println("It's a draw!");
		}
		else if ( (draw1 + draw2) < (draw3 + draw4) )
		{
			System.out.println("YOU LOOSE!");
		}
	}
}