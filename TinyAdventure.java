import java.util.Scanner;
public class TinyAdventure
{
	public static void main( String[] args )
	{
		Scanner keyboard=new Scanner(System.in);
		System.out.println("WELCOME TO RICHARD'S TINY ADVENTURE! \n");
		System.out.println("You are in a creepy house! Would you like to go \"upstairs\" or into the \"kitchen\"?");
		System.out.print("> ");
		String decision1=keyboard.next();
		System.out.println();
		if(decision1.equals("kitchen"))
		{
			System.out.println("There is a long countertop with dirty dishes everywhere. Off to one side there is, as you'd expect, a refrigerator. You may open the \"refrigerator\" or look in a \"cabinet\".");
			System.out.print("> ");
			String decision2=keyboard.next();
			System.out.println();
			if(decision2.equals("refrigerator"))
			{
				System.out.println("Inside the refrigerator you see food and stuff. It looks pretty nasty. Would you like to eat some of the food?");
				System.out.print("> ");
				String decision3 = keyboard.next();
				if(decision3.equals("yes"))
				{
					System.out.println("You die from the expired food.");
				}
				else if(decision3.equals("no"))
				{
					System.out.println("You die of starvation...eventually.");
				}
				
			}
			else if(decision2.equals("cabinet"))
			{
				System.out.println("You see some canned food, would you like to eat some of the food?");
				System.out.print("> ");
				String decision4=keyboard.next();
				System.out.println();
				if(decision4.equals("yes"))
				{
					System.out.println("You die from the expired food.");
				}
				else if(decision4.equals("no"))
				{
					System.out.println("You die of starvation...eventually.");
				}
			
			}
			
		}
		else if(decision1.equals("upstairs"))
		{
			System.out.println("Upstairs you see a hallway. At the end of the hallway is the master \"bedroom\". There is also a \"bathroom\" off the hallway. Where would you like to go?");
			System.out.print("> ");
			String decision5=keyboard.next();
			System.out.println();
			if(decision5.equals("bedroom"))
			{
				System.out.println("You are in a plush bedroom, with expensive-looking hardwood furniture. The bed is unmade. In the back of the room the closet door is ajar. Would you like to open the door?");
				System.out.print("> ");
				String decision6=keyboard.next();
				System.out.println();
				if(decision6.equals("yes"))
				{
					System.out.println("A secret door lays unlocked from which you escape the haunted house.");
				}
				else if(decision6.equals("no"))
				{
					System.out.println("You are unable to find a way out of the house and you eventually die inside.");
				}
			}
			else if(decision5.equals("bathroom"))
			{
				System.out.println("You walk in and the door closes behind you. Do you try to break open the \"door\" or break open the \"window\"?");
				System.out.print("> ");
				String decision7=keyboard.next();
				System.out.println();
				if(decision7.equals("door"))
				{
					System.out.println("You are unable to break open the door and eventually die.");
				}
				else if(decision7.equals("window"))
				{
					System.out.println("After many hours, you finally break open the window and escape, albeit with a broken leg from jumping out of the window to the ground below.");
				}
			}
		}
	}
}