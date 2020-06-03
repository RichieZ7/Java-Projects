import java.util.Scanner;

public class EnterPIN
{
	public static void main( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);
		int pin = 12345;

		System.out.println("WELCOME TO THE BANK OF MITCHELL.");
		System.out.print("ENTER YOUR PIN: ");
		int entry = keyboard.nextInt();
		// while loop is similar is that the statement within is run when the condition is true, both use boolean conditions
		// while loop is different in that it keeps on running until condition is false to which the first line beneath while statement is executed
		while ( entry != pin )
		{
			System.out.println("\nINCORRECT PIN. TRY AGAIN.");
			System.out.print("ENTER YOUR PIN: ");
			// no need for int in front of entry as it is already declared as type int and is simply being reassigned a new value
			// if statement below is deleted, the while loop will go on forever if wrong pin is entered as there is no chance to reassign the entry value which will always remain false
			entry = keyboard.nextInt();
		}

		System.out.println("\nPIN ACCEPTED. YOU NOW HAVE ACCESS TO YOUR ACCOUNT.");
	}
}