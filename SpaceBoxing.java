import java.util.Scanner;
public class SpaceBoxing
{
		
	public static void main( String[] args )
	{
		Scanner keyboard= new Scanner(System.in);
		System.out.print("Please enter your current Earth weight: ");
		double weight = keyboard.nextInt();
		double newWeight= weight;
		System.out.println();
		System.out.println("I have information for the following planets:");
		System.out.println("    1. Venus    2. Mars    3. Jupiter");
		System.out.println("    4. Saturn   5. Uranus  6. Neptune");
		System.out.println();
		System.out.print("Which planet are you visiting? ");
		int planet=keyboard.nextInt();
		System.out.println();
		if( planet == 1 )
		{
			newWeight=weight*0.78;
			
		}
		else if( planet == 2 )
		{
			newWeight=weight*0.39;
			
		}
		else if( planet == 3 )
		{
			newWeight=weight*2.65;
			
		}
		else if( planet == 4 )
		{
			newWeight=weight*1.17;
			
		}
		else if( planet == 5 )
		{
			newWeight=weight*1.05;
			
		}
		else if( planet == 6 )
		{
			newWeight=weight*1.23;
			
		}
		else
		{
			System.out.println("error");
		}

		System.out.println("Your weight would be "+newWeight+" pounds on that planet.");
	}
}
