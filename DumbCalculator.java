import java.util.Scanner;
public class DumbCalculator
{
	public static void main( String[] args)
	{
		Scanner keyboard=new Scanner(System.in);
		System.out.println();
		System.out.print("What is your first number? ");
		double firstNumber=keyboard.nextDouble();
		System.out.print("What is your second number? ");
		double secondNumber=keyboard.nextDouble();
		System.out.print("What is your third number? ");
		double thirdNumber=keyboard.nextDouble();
		System.out.println();
		System.out.print("( "+firstNumber+" + "+secondNumber+" + "+thirdNumber+" "+") / 2 is... ");
		System.out.print((firstNumber+secondNumber+thirdNumber)/2);
	}
}
		