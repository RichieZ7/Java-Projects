import java.util.Scanner;
import java.util.Random;
public class HiLoLimited
{
	public static void main( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);
		Random r = new Random();
		int x = r.nextInt(100) + 1;
		int guess = 0;
		int counter = 0;
		System.out.println("I'm thinking of a number between 1-100. You have 7 guesses.");
		while(guess != x && counter < 7 )
		{
			System.out.print("Guess #"+(counter+1)+": ");
			guess = keyboard.nextInt();
			if( guess > x )
			{
				System.out.println("Sorry, you are too high.");
			}
			if ( guess < x )
			{
				System.out.println("Sorry, you are too low.");
			}
			counter++;
		}
		if( guess == x )
		{
			System.out.println("You guessed it! What are the odds?!?");
		}
		if( guess != x && counter == 7 )
		{
			System.out.println("Sorry, you didn't guess it in 7 tries. You lose.");
		}
	}
}
	