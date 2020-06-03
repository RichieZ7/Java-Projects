import java.util.Scanner;
public class AddingValuesForLoop
{
	public static void main ( String[] args )
	{
	
		Scanner keyboard = new Scanner ( System.in );
		System.out.print("Number: ");
		int input = keyboard.nextInt();
		int sum = 0;
		System.out.println();
		for ( int i = 1; i <= input; i++ )
		{
			System.out.print(i + " ");
			sum = sum + i;
		}
		System.out.println("\nThe sum is " + sum + ".");
	}
}
	