public class ElseAndIf
{
	public static void main( String[] args )
	{
		int people = 30;
		int cars = 40;
		int buses = 15;
		// if statements are evaluated for true and false values, and if true they code in the scope is executed
		// else statements are executed when the if statements are false
		// else if statements are executed like if statements but can only be executed if all statements before it are false and then disregards all code underneath if true

		// these are all control flow statements
		if ( cars > people )
		{
			System.out.println( "We should take the cars." );
		}
		//if the else in the else if is removed, a new if else statement will created which is detached from the original if statement, making two distinct new control flow statements
		if ( cars < people )
		{
			System.out.println( "We should not take the cars." );
		}
		else
		{
			System.out.println( "We can't decide." );
		}


		if ( buses > cars )
		{
			System.out.println( "That's too many buses." );
		}
		if ( buses < cars )
		{
			System.out.println( "Maybe we could take the buses." );
		}
		else
		{
			System.out.println( "We still can't decide." );
		}


		if ( people > buses )
		{
			System.out.println( "All right, let's just take the buses." );
		}
		else
		{
			System.out.println( "Fine, let's stay home then." );
		}

	}
}