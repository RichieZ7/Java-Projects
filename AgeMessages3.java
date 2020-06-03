import java.util.Scanner;
public class AgeMessages3
{
	public static void main( String[] args)
	{
		Scanner keyboard=new Scanner(System.in);
		System.out.print("Your name: ");
		String name=keyboard.next();
		System.out.print("Your age: ");
		int age=keyboard.nextInt();
		System.out.println();
		String text="";
		if(age<16)
		{
			text="You can't drive, ";
		}
		if(age==16 || age==17)
		{
			text="You can drive but not vote, ";
		}
		if(age>=18 && age<=24)
		{
			text="You can vote but not rent a car, ";
		}
		if(age>25)
		{
			text= "You can do pretty much anything, ";
		}
		System.out.println(text+name+".");

	}
}