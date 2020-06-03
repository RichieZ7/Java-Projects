public class NumbersAndMath
{
	public static void main( String[] args )
	{
		//*Changed to use floating point numbers to convert answers to double instead of int(won't drop the decimal point to conform to int characteristics) int vs double division
		//Print
		System.out.println( "I will now count my chickens:" );
		//Prints and then adds 30/6=5 with 25 which is 30 to the line
		System.out.println( "Hens " + ( 25.0 + 30.0 / 6.0 ) );
		//Prints and then does -25*3=-75 and then divides by 4 to get a remainder of 3 which is then subtracted from 100 to get 97
		System.out.println( "Roosters " + ( 100.0 - 25.0 * 3.0 % 4.0 ) );
		//Print
		System.out.println( "Now I will count the eggs:" );
		//Does 4/2 with a remainder of 0 and does -1/4=-1/4 as a fraction
		//All the rest of the numbers are then added but the decimals are dropped, equals 7
		System.out.println( 3.0 + 2.0 + 1.0 - 5.0 + 4.0 % 2.0 - 1.0 / 4.0 + 6.0 );
		//Print
		System.out.println( "Is it true that 3 + 2 < 5 - 7?" );
		//Uses relational operators to print boolean value of false
		System.out.println( 3.0 + 2.0 < 5.0 - 7.0 );
		//Print strings and then values with operators
		System.out.println( "What is 3 + 2? " + ( 3.0 + 2.0 ) );
		System.out.println( "What is 5 - 7? " + ( 5.0 - 7.0 ) );
		//Print
		System.out.println( "Oh, that's why it's false." );
		//Print
		System.out.println( "How about some more." );
		//Print and uses more relational operators to print boolean values
		System.out.println( "Is it greater? " + ( 5.0 > -2.0 ) );
		System.out.println( "Is it greater or equal? " + ( 5.0 >= -2.0 ) );
		System.out.println( "Is it less or equal? " + ( 5.0 <= -2.0 ) );
	}
}