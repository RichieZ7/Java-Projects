import java.util.Random;

public class Randomness
{
	public static void main ( String[] args )
	{
		//same number is printed despite being "random" if seed is changed
		Random r = new Random();

		int x = 1 + r.nextInt(10);

		System.out.println( "My random number is " + x );
		// new range of numbers is from 0-4 inclusive(delete 1+ )
		//new range of numbers is from 3-7 inclusive(add 3+ )
		System.out.println( "Here are some numbers from 1 to 5!" );
		System.out.print( 3 + r.nextInt(5) + " " );
		System.out.print( 3 + r.nextInt(5) + " " );
		System.out.print( 3 + r.nextInt(5) + " " );
		System.out.print( 3 + r.nextInt(5) + " " );
		System.out.print( 3 + r.nextInt(5) + " " );
		System.out.print( 3 + r.nextInt(5) + " " );
		System.out.println();

		System.out.println( "Here are some numbers from 1 to 100!" );
		System.out.print( 1 + r.nextInt(100) + "\t" );
		System.out.print( 1 + r.nextInt(100) + "\t" );
		System.out.print( 1 + r.nextInt(100) + "\t" );
		System.out.print( 1 + r.nextInt(100) + "\t" );
		System.out.print( 1 + r.nextInt(100) + "\t" );
		System.out.print( 1 + r.nextInt(100) + "\t" );
		System.out.println();

		int num1 = 1 + r.nextInt(10);
		int num2 = 1 + r.nextInt(10);

		if ( num1 == num2 )
		{
			System.out.println( "The random numbers were the same! Weird." );
		}
		if ( num1 != num2 )
		{
			System.out.println( "The random numbers were different! Not too surprising, actually." );
		}
	}
}