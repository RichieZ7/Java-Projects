import java.util.Random;
import java.util.Scanner;
public class KeepGuessing
{
	public static void main( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);
		Random r = new Random();
		int x = r.nextInt(10) + 1;
		System.out.println("I have chosen a number between 1 and 10. Try to guess it.");
		System.out.print("Your guess: ");
		int guess = keyboard.nextInt();
		while(guess != x)
		{
			System.out.println("That is incorrect. Guess again.");
			System.out.print("Your guess: ");
			guess = keyboard.nextInt();
		}
		System.out.println("That's right! You're a good guesser.");
	}
}
			