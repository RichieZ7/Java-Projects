import java.util.Scanner;
public class BMI_Calculator
{
	public static void main( String[] args)
	{
		Scanner keyboard=new Scanner(System.in);
		System.out.print("Your height (feet): ");
		int heightFeet=keyboard.nextInt();
		System.out.print("Your height (inches): ");
		int heightInches=keyboard.nextInt();
		System.out.print("Your weight (pounds): ");
		int weightPounds=keyboard.nextInt();
		double heightMeters=(heightFeet*12+heightInches)*0.0254;
		double weightKilograms=weightPounds*0.453592; 
		double BMI=weightKilograms/(heightMeters*heightMeters);
		System.out.println();
		System.out.print("Your BMI is "+BMI);
	}
}