import java.util.Random;
public class Dice
{
	public static void main( String[] args )
	{
		System.out.println("HERE COMES THE DICE! \n ");
		Random r = new Random();
		int roll1 = r.nextInt(6) + 1;
		int roll2 = r.nextInt(6) + 1;
		System.out.println("Roll #1: " + roll1);
		System.out.println("Roll #2: " + roll2);
		System.out.println("The total is " + (roll1 + roll2) + "!");
	}
}