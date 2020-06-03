import java.util.Scanner;
import java.util.Random;
public class ThreeCardMonte
{
	public static void main( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);
		Random r = new Random();
		int x = r.nextInt(3) + 1;
		System.out.println("You slide up to Fast Eddie's card table and plop down your cash.");
		System.out.println("He glances at you out of the corner of his eye and starts shuffling.");
		System.out.println("He lays down three cards. \n");
		System.out.println("Which one is the ace? \n");
		System.out.println("\t ##  ##  ##");
		System.out.println("\t ##  ##  ##");
		System.out.println("\t 1   2   3");
		System.out.println();
		System.out.print("> ");
		int guessedNumber = keyboard.nextInt();
		System.out.println();
		if( guessedNumber == x )
		{ 
			System.out.println("You nailed it! Fast Eddie reluctantly hands over your winnings, scowling.");
		}
		if( guessedNumber !=x )
		{
			System.out.println("Ha! Fast Eddie wins again! The ace was card number " + x + ".");
		}
		System.out.println();
		if( x==1 )
		{
			System.out.println("\t AA  ##  ##");
			System.out.println("\t AA  ##  ##");
			System.out.println("\t 1   2   3");
		}
		if( x==2 )
		{
			System.out.println("\t ##  AA  ##");
			System.out.println("\t ##  AA  ##");
			System.out.println("\t 1   2   3");
		}
		if( x==3 )
		{
			System.out.println("\t ##  ##  AA");
			System.out.println("\t ##  ##  AA");
			System.out.println("\t 1   2   3");
		}
	}
}
		