import java.util.Scanner;

public class CountingFor
{
    public static void main( String[] args )
    {
        Scanner keyboard = new Scanner(System.in);

        System.out.println( "Type in a message, and I'll display it ten times." );
        System.out.print( "Message: " );
        String message = keyboard.nextLine();
	//n = n + 1 increments the counter variable so that it will work in the boolean condition and stop the loop
	//int n = 1 declares and intializes the counter variable which is used in the boolean condition
		
        for ( int n = 2 ; n <= 10 ; n = n + 2 )
        {
            System.out.println( n + ". " + message );
        }

    }
}