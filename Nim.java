import java.util.Scanner;

public class Nim
{
	public static void main ( String[] args )
	{
		Scanner keyboard = new Scanner ( System.in );
		int pileA, pileB, pileC;
		pileA = 3;
		pileB = 4;
		pileC = 5;
		String pileChosen;
		int amountRemoved;
		int counter = 2;
		String winner = "";
		System.out.print("Player 1, enter your name: ");
		String playerOne = keyboard.next();
		System.out.print("Player 2, enter your name: ");
		String playerTwo = keyboard.next();
		String player = playerOne;
		System.out.println();
		System.out.println("A: " + pileA + "\t" + "B: " + pileB + "\t" + "C: " + pileC);
		System.out.println();
		while ( pileA > 0 || pileB > 0 || pileC > 0 )
		{
			System.out.print( player + ", choose a pile: ");
			pileChosen = keyboard.next();

			while ( pileChosen.equals("A") && pileA == 0 )
			{
				System.out.print("Nice try, " + player + ". That pile is empty. Choose again: ");
				pileChosen = keyboard.next();
			}
			
			while ( pileChosen.equals("B") && pileB == 0 )
			{
				System.out.print("Nice try, " + player + ". That pile is empty. Choose again: ");
				pileChosen = keyboard.next();
			}
			
			while ( pileChosen.equals("C") && pileC == 0 )
			{
				System.out.print("Nice try, " + player + ". That pile is empty. Choose again: ");
				pileChosen = keyboard.next();
			}

			System.out.print("How many to remove from pile " + pileChosen + ": ");
			amountRemoved = keyboard.nextInt();

			while ( amountRemoved < 1 )
			{
				System.out.print("You must choose at least 1. How many? ");
				amountRemoved = keyboard.nextInt();
			}

			if ( pileChosen.equals("A") )
			{
				while ( amountRemoved > pileA )
				{
					System.out.print("Pile " + pileChosen + " dosen't have that many. Try again: ");
					amountRemoved = keyboard.nextInt();
				}
				pileA = pileA - amountRemoved;
			}

			if ( pileChosen.equals("B") )
			{
				while ( amountRemoved > pileB )
				{
					System.out.print("Pile " + pileChosen + " dosen't have that many. Try again: ");
					amountRemoved = keyboard.nextInt();
				}
				pileB = pileB - amountRemoved;
			}

			if ( pileChosen.equals("C") )
			{
				while ( amountRemoved > pileC )
				{
					System.out.print("Pile " + pileChosen + " dosen't have that many. Try again: ");
					amountRemoved = keyboard.nextInt();
				}
				pileC = pileC - amountRemoved;
			}

			System.out.println();
			System.out.println("A: " + pileA + "\t" + "B: " + pileB + "\t" + "C: " + pileC);
			System.out.println();
			
			if ( pileA == 1 && pileB == 0 && pileC == 0 )
			{
				pileA = pileB = pileC = -1;
				winner = player;
				if ( counter % 2 == 1 )
				{
					player = playerOne;
					counter++;
				}

				else if ( counter % 2 == 0 )
				{
					player = playerTwo;
					counter++;
				}
				System.out.println(player + ", you must take the last remaining counter, so you lose. " + winner + " wins!");
			}

			if ( pileA == 0 && pileB == 1 && pileC == 0 )
			{
				pileA = pileB = pileC = -1;
				winner = player;
				if ( counter % 2 == 1 )
				{
					player = playerOne;
					counter++;
				}

				else if ( counter % 2 == 0 )
				{
					player = playerTwo;
					counter++;
				}
				System.out.println(player + ", you must take the last remaining counter, so you lose. " + winner + " wins!");
			}

			if ( pileA == 0 && pileB == 0 && pileC == 1 )
			{
				pileA = pileB = pileC = -1;
				winner = player;
				if ( counter % 2 == 1 )
				{
					player = playerOne;
					counter++;
				}

				else if ( counter % 2 == 0 )
				{
					player = playerTwo;
					counter++;
				}
				System.out.println(player + ", you must take the last remaining counter, so you lose. " + winner + " wins!");
			}
		
			if ( counter % 2 == 1 )
			{
				player = playerOne;
				counter++;
			}

			else if ( counter % 2 == 0 )
			{
				player = playerTwo;
				counter++;
			}


		}
			winner = player;
			if ( pileA == 0 && pileB == 0 && pileC ==0 )
				System.out.println( winner + ", there are no counters left, so you WIN!");
	}
}