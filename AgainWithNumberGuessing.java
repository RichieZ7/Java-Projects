import java.util.Scanner;
import java.util.Random;
public class AgainWithNumberGuessing
{
	public static void main ( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);
		Random r = new Random();
		int randomNumber = r.nextInt(10) + 1;
		int counter = 0;
		int guess;
		System.out.println("I have chosen a number between 1 and 10. Try to guess it.");
		do
		{
			System.out.print("Your guess: ");
			guess = keyboard.nextInt();
			counter++;
			if ( guess == randomNumber )
			{
				System.out.println("That's right! You're a good guesser.");
				System.out.println("It only took you " + counter + " tries.");
			}
			else 
			{
				System.out.println("That is incorrect. Guess again.");
			}
		} while( guess != randomNumber );
	}
}
		