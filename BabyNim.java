import java.util.Scanner;

public class BabyNim
{
	public static void main ( String[] args )
	{
		Scanner keyboard = new Scanner ( System.in );
		int pileA = 3;
		int pileB = 3;
		int pileC = 3;
		String chosenPile;
		int amountToRemove;
		System.out.println("A: "+ pileA + "\t" + "B: "+ pileB + "\t" + "C: "+ pileC);
		System.out.println();
		while ( pileA > 0 || pileB > 0 || pileC > 0 )
		{
			System.out.print("Choose a pile: ");
			chosenPile = keyboard.next();
			System.out.print("How many to remove from the pile " + chosenPile + ": ");
			amountToRemove = keyboard.nextInt();
			if ( chosenPile.equals("A") )
			{
				pileA = pileA - amountToRemove;
			}
			else if ( chosenPile.equals("B") )
			{
				pileB = pileB - amountToRemove;
			}
			else if ( chosenPile.equals("C") )
			{
				pileC = pileC - amountToRemove;
			}
			System.out.println();
			System.out.println("A: "+ pileA + "\t" + "B: "+ pileB + "\t" + "C: "+ pileC + "\n");
			
		}
		System.out.println("All piles are empty. Good job!");
	}
}