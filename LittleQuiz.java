import java.util.Scanner;
public class LittleQuiz
{
	public static void main( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Are you ready for a quiz? " );
		keyboard.next();
		System.out.println("Okay, here it comes!");
		System.out.println();
		System.out.println("Q1) What is the capital of Alaska?");
		System.out.println("    1) Melbourne");
		System.out.println("    2) Anchorage");
		System.out.println("    3) Juneau");
		System.out.println();
		System.out.print("> ");
		int answer1=keyboard.nextInt();
		System.out.println();
		if( answer1==3 )
		{
			System.out.println("Correct!");
			
		}
		else 
		{
			System.out.println("Sorry, the answer is Juneau.");
		}
		System.out.println();
		System.out.println("Q2) Can you store the value \"cat\" in a variable of type int?");
		System.out.println("    1) yes");
		System.out.println("    2) no");
		System.out.println();
		System.out.print("> ");
		int answer2=keyboard.nextInt();
		System.out.println();
		if( answer2==2 )
		{
			System.out.println("Correct!");
		}
		else
		{
			System.out.println("Sorry, \"cat\" is a string. Only ints can store numbers.");
		}
		System.out.println();
		System.out.println("Q3) What is the result of 9+6/3?");
		System.out.println("    1) 5");
		System.out.println("    2) 11");
		System.out.println("    3) 15/3");
		System.out.println();
		System.out.print("> ");
		int answer3=keyboard.nextInt();
		System.out.println();
		if( answer3==2 )
		{
			System.out.println("Correct!");
			
		}
		else 
		{
			System.out.println("Sorry, the answer is 2.");
		}
		System.out.println();
		if(answer1==3 && answer2==2 && answer3==2)
		{
			System.out.println("Overall, you got 3 out of 3 correct.");
		}
		else if(answer1!=3 && answer2==2 && answer3==2)
		{
			System.out.println("Overall, you got 2 out of 3 correct.");
		}
		else if(answer1==3 && answer2!=2 && answer3==2)
		{
			System.out.println("Overall, you got 2 out of 3 correct.");
		}
		else if(answer1==3 && answer2==2 && answer3!=2)
		{
			System.out.println("Overall, you got 2 out of 3 correct.");
		}
		else if(answer1!=3 && answer2!=2 && answer3==2)
		{
			System.out.println("Overall, you got 1 out of 3 correct.");
		}
		else if(answer1==3 && answer2!=2 && answer3!=2)
		{
			System.out.println("Overall, you got 1 out of 3 correct.");
		}
		else if(answer1!=3 && answer2==2 && answer3!=2)
		{
			System.out.println("Overall, you got 1 out of 3 correct.");
		}
		else
		{
			System.out.println("Overall, you got 0 out of 3 correct.");
		}
		System.out.println("Thanks for playing!");
	}
}
		