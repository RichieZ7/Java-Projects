import java.util.Scanner;
public class CollatzSequence
{
	public static void main( String[] args ) throws Exception
	{
		Scanner keyboard = new Scanner(System.in);
		int stepCounter = 0;
		int largestNumber = 0;
		int number;
		System.out.print("Starting number: ");
		number = keyboard.nextInt();
		while( number != 1 )
		{
			System.out.print(number+"\t");
			if( number % 2 == 0 )
			{
				number = number/2;
				stepCounter++;
			}
			else if( number % 2 == 1 )
			{
				number = 3*number+1;
				stepCounter++;
			}
			if( stepCounter % 10 == 0 )
			{
				System.out.println();
			}
			if( number > largestNumber )
			{
				largestNumber = number;
			}
			Thread.sleep(50);
		}
		System.out.print(number);
		System.out.println();
		System.out.println("\nTerminated after " + stepCounter + " steps.");		
		System.out.println("The largest value was " + largestNumber + ".");
	}
}