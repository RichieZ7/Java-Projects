import java.util.Scanner;

public class CountingWhile
{
	public static void main( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);

		System.out.println( "Type in a message, and I'll display it several times." );
		System.out.print( "Message: " );
		String message = keyboard.nextLine();
		System.out.print("How many times? ");
		int loopAmount = keyboard.nextInt();
		int n = 0;
		while ( n < 10*loopAmount )
		{
			System.out.println( (n+10) + ". " + message );
			//n++ equals n=n+1, increases counter by one each time while loop runs
			n = n + 10;
		}

	}
}