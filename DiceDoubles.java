import java.util.Random;
public class DiceDoubles
{
	public static void main( String[] args )
	{
		Random r = new Random();
		int roll1 = r.nextInt(6) + 1;
		int roll2 = r.nextInt(6) + 1;
		int loopCounter = 1;
		System.out.println("HERE COMES THE DICE! \n");
		System.out.println("ROLL "+ loopCounter);
		System.out.println("Roll #1: " + roll1);
		System.out.println("Roll #2: " + roll2);
		int total = roll1 + roll2;
		System.out.println("The total is " + total + "!");
		while(roll1 != roll2)
		{
			System.out.println();
			loopCounter++;
			System.out.println("ROLL " + loopCounter);
			roll1 = r.nextInt(6) + 1;
			roll2 = r.nextInt(6) + 1;
			System.out.println("Roll #1: " + roll1);
			System.out.println("Roll #2: " + roll2);
			total = roll1 + roll2;
			System.out.println("The total is " + total + "!");
		}
		System.out.println("WE GOT A DOUBLE!");
	}
}