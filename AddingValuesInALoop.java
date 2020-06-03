import java.util.Scanner;
public class AddingValuesInALoop
{
	public static void main( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);
		System.out.println("I will add up the numbers you give me.");
		int inputNumber = 1;
		int sum = 0;
		while(inputNumber != 0 )
		{
			System.out.print("Number: ");
			inputNumber = keyboard.nextInt();
			sum = sum + inputNumber;
			System.out.println("The total so far is " + sum + ".");
		}
		System.out.println("\nThe total is " + sum + ".");
	}
}