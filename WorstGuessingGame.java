import java.util.Scanner;
public class WorstGuessingGame
{
	public static void main( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);
		System.out.println("THE WORST NUMBER GUESSING GAME EVER!!! \n");
		System.out.print("I'm thinking of a number from 1-10. Try to guess that number. ");
		String guessedNumber=keyboard.next();
		System.out.println();
		String notSecretNumber="7";
		if(notSecretNumber.compareTo(guessedNumber)!=0)
		{
			System.out.println("Wow you can't even guess it. It was "+notSecretNumber+".");
		}
		else
		{
			System.out.println("Wow you got it, great job!");
		}
	}
}