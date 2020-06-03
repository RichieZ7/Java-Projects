import java.util.Random;
public class ShorterDoubleDice
{
	public static void main ( String[] args )
	{
		Random r = new Random();
		System.out.println("HERE COME THE DICE! \n");
		int roll1;
		int roll2;
		int counter=1;
		do
		{
			System.out.println("ROLL " + counter);
			roll1= r.nextInt(6) + 1;
			roll2= r.nextInt(6) + 1;
			System.out.println("Roll #1: " + roll1);
			System.out.println("Roll #2: " + roll2);
			System.out.println("The total is " + (roll1 + roll2) + "!");
			System.out.println();
			counter++;
		} while( roll1 != roll2 );
		System.out.println("WE GOT A DOUBLE!");
	}
}
			