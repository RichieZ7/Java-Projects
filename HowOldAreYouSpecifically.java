import java.util.Scanner;
public class HowOldAreYouSpecifically
{
	public static void main( String[] args)
	{
		Scanner keyboard=new Scanner(System.in);
		System.out.print("Hey, what's your name? (Sorry, I keep forgetting.) ");
		String name= keyboard.next();
		System.out.print("Ok, "+name+", how old are you? ");
		int age=keyboard.nextInt();
		System.out.println();
		if( age < 16)
		{
			System.out.println("You can't drive.");
		}
		else if( age==16)
		{
			System.out.println("You can drive but not vote.");
		}
		else if( age==17)
		{
			System.out.println("You can drive but not vote.");
		}
		else if( age==18)
		{
			System.out.println("You can vote but not rent a car.");
		}
		else if( age==19)
		{
			System.out.println("You can vote but not rent a car.");
		}
		else if( age==20)
		{
			System.out.println("You can vote but not rent a car.");
		}
		else if( age==21)
		{
			System.out.println("You can vote but not rent a car.");
		}
		else if( age==22)
		{
			System.out.println("You can vote but not rent a car.");
		}
		else if( age==23)
		{
			System.out.println("You can vote but not rent a car.");
		}
		else if( age==24)
		{
			System.out.println("You can vote but not rent a car.");
		}
		else if(age>=25)
		{
			System.out.println("You can do pretty much anything.");
		}
	}
}
		