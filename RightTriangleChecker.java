import java.util.Scanner;
public class RightTriangleChecker
{
	public static void main ( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);
		int side1, side2, side3;
		System.out.println("Enter three integers: ");
		System.out.print("Side 1: ");
		side1 = keyboard.nextInt();
		do
		{
			System.out.print("Side 2: ");
			side2 = keyboard.nextInt();
			if( side2 < side1 )
			{
				System.out.println( side2 + " is smaller than " + side1 + ". Try again.");
			}
		} while ( side1 > side2 );
		do
		{
			System.out.print("Side 3: ");
			side3 = keyboard.nextInt();
			if( side3 < side2 )
			{
				System.out.println( side3 + " is smaller than " + side2 + ". Try again.");
			}
		} while ( side2 > side3 );
		System.out.println();
		System.out.println("Your three sides are " + side1 + ", " + side2 + ", and " + side3+ ".");
		if( side1*side1 + side2*side2 == side3*side3)
		{
			System.out.println("These sides make a right triangle!");
		}
		else
		{
			System.out.println("These sides don't make a right triangle.");
		}
	}
}
	
				