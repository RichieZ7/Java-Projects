import java.util.Scanner;
public class BMI_Categories
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
		System.out.println("Your BMI is "+BMI);
		String BMI_Category="";
		if(BMI<15.0)
		{
			BMI_Category="very severely underweight";
		}
		if(BMI>=15.0 && BMI<=16.0)
		{
			BMI_Category="severely underweight";
		}
		if(BMI>= 16.1 && BMI<=18.4)
		{
			BMI_Category="underweight";
		}	
		if(BMI>=18.5 && BMI<=24.9)
		{
			BMI_Category="normal weight";
		}
		if(BMI>=25.0 && BMI<=29.9)
		{
			BMI_Category="overweight";
		}
		if(BMI>=30.0 && BMI<=34.9)
		{
			BMI_Category="moderately obese";
		}
		if(BMI>=35.0 && BMI<=39.9)
		{
			BMI_Category="severely obese";
		}
		if(BMI>=40.0)
		{
			BMI_Category="very severely (or \"morbidly\") obese";
		}
		System.out.println("BMI Category: "+BMI_Category);
		
		
	}
}