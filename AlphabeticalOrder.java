import java.util.Scanner;
public class AlphabeticalOrder
{
	public static void main ( String[] args )
	{
		Scanner keyboard=new Scanner(System.in);
		System.out.print("What's your last name? ");
		String lastName=keyboard.next();
		if("Carswell".compareTo(lastName) >= 0)
		{
			System.out.println("You don't have to wait long, "+"\""+lastName+"\".");
		}
		else if("Jones".compareTo(lastName) >= 0)
		{
			System.out.println("That's not bad, "+"\""+lastName+"\".");
		}
		else if("Smith".compareTo(lastName) >= 0)
		{
			System.out.println("Looks like a bit of a wait, "+"\""+lastName+"\".");
		}
		else if("Young".compareTo(lastName) >= 0)
		{
			System.out.println("It's gonna be a while, "+"\""+lastName+"\".");
		}
		else if("Young".compareTo(lastName) < 0)
		{
			System.out.println("Are you going anywhere for a while, "+"\""+lastName+"\"?");
		}
	}
}