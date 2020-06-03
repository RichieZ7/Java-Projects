import java.util.Random;
import java.util.Scanner;
public class OneShotHiLo
{
	public static void main( String [] args )
	{
		Scanner keyboard = new Scanner(System.in);
		Random r = new Random();
		int randomNumber = r.nextInt(100) + 1; 
		System.out.println("I'm thinking of a number between 1-100. Try to guess it.");
		System.out.print("> ");
		int guess = keyboard.nextInt();
		System.out.println();
		if( guess > randomNumber)
		{
			System.out.println("Sorry, you are too high. I was thinking of " + randomNumber + ".");
		}
		if( guess < randomNumber)
		{
			System.out.println("Sorry, you are too low. I was thinking of " + randomNumber + ".");
		}
		if( guess == randomNumber)
		{
			System.out.println("You guessed it! What are the odds?!?");
		}
		
	}
}