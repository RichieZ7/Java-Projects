import java.util.Scanner;
public class SafeSquareRoot
{
	public static void main ( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);
		double input;
		double squareRoot;
		System.out.println("SQUARE ROOT CALCULATOR");
		System.out.print("Enter a number: ");
		input = keyboard.nextDouble();
		while ( input < 0 )
		{
			System.out.println("You can't take the square root of a negative number, silly.");
			System.out.print("Try again: ");
			input = keyboard.nextDouble();
		}	
		squareRoot = Math.sqrt(input);
		System.out.println("The square root of " + input + " is " + squareRoot + ".");
	}
}