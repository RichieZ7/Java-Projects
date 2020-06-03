import java.util.Scanner;

public class CountingMachineRevisited
{
	public static void main ( String[] args )
	{
		Scanner keyboard = new Scanner ( System.in );
		System.out.print("Count from: ");
		int startingAmount = keyboard.nextInt();
		System.out.print("Count to: ");
		int endingAmount = keyboard.nextInt();
		System.out.print("Count by: ");
		int addingAmount = keyboard.nextInt();
		System.out.println();
		for ( int i = startingAmount; i <= endingAmount; i = i + addingAmount )
		{
			System.out.print(i + " ");
		}
	}
}