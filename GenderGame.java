import java.util.Scanner;
public class GenderGame
{
	public static void main( String[] args )
	{
		Scanner keyboard=new Scanner(System.in);
		System.out.print("What is your gender (M or F): ");
		String gender=keyboard.next();
		System.out.print("First name: ");
		String firstName=keyboard.next();
		System.out.print("Last name: ");
		String lastName=keyboard.next();
		System.out.print("Age: ");
		int age=keyboard.nextInt();
		System.out.println();
		String title="";
		if(gender.equals("M") && age>=20)
		{
			title="Mr. ";
		}
		if(gender.equals("F") && age>= 20)
		{
			System.out.print("Are you married, "+firstName+" "+lastName+" (y or n)? ");
			String marriageStatus=keyboard.next();
			System.out.println();
			if(marriageStatus.equals("y"))
			{
				title="Mrs. ";
			}
			else
			{
				title="Ms. ";
			}
		}
		System.out.println("Then I shall call you "+title+firstName+" "+lastName);
	}
}