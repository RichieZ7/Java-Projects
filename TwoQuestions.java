import java.util.Scanner;

public class TwoQuestions
{

	public static void main( String[] args )
	{
		String object="";
		Scanner keyboard=new Scanner(System.in);
		System.out.println("TWO QUESTIONS!");
		System.out.println("Think of an object, and I'll try to guess it.");
		System.out.println();
		System.out.println("Question 1) Is it animal, vegetable, or mineral?");
		System.out.print("> ");
		String answer1=keyboard.next();
		System.out.println();
		System.out.println("Question 2) Is it bigger than a breadbox?");
		System.out.print("> ");
		String answer2=keyboard.next();
		System.out.println();
		if(answer1.equals("animal"))
		{
			if(answer2.equals("yes"))
			{
				object="moose";
			}
			else if(answer2.equals("no"))
			{
				object="squirrel";
			}
		}
		else if(answer1.equals("vegetable"))
		{
			if(answer2.equals("yes"))
			{
				object="watermelon";
			}
			else if(answer2.equals("no"))
			{
				object="carrot";
			}
		}
		else if(answer1.equals("mineral"))
		{
		
			if(answer2.equals("yes"))
			{
				object="Camaro";
			}
			else if(answer2.equals("no"))
			{
				object="paper clip";
			}
		}
		System.out.println("You're thinking of a " + object+"!");
		System.out.println("I would ask you if I'm right, but I don't actually care.");
		}
}