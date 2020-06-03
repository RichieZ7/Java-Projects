import java.util.Scanner;
public class TwoMoreQuestions
{
	public static void main( String[] args)
	{
		Scanner keyboard=new Scanner(System.in);
		String object="";
		System.out.println("TWO MORE QUESTIONS \n");
		System.out.println("Think of something and I'll try to guess it! \n");
		System.out.print("Question 1) Does it stay inside or outside or both? ");
		String answer1=keyboard.next();
		System.out.print("Question 2) Is it a living thing? ");
		String answer2=keyboard.next();
		System.out.println();
		if(answer1.equals("outside") && answer2.equals("yes"))
		{
			object="bison";
		}
		if(answer1.equals("outside") && answer2.equals("no"))
		{
			object="billboard";
		}
		if(answer1.equals("inside") && answer2.equals("yes"))
		{
			object="houseplant";
		}
		if(answer1.equals("inside") && answer2.equals("no"))
		{
			object="shower curtain";
		}
		if(answer1.equals("both") && answer2.equals("yes"))
		{
			object="dog";
		}
		if(answer1.equals("both") && answer2.equals("no"))
		{
			object="cell phone";
		}
		System.out.println("You are thinking of a "+object+".");
	}
}
