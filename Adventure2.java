import java.util.Scanner;

public class Adventure2
{
	public static void main( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);
		
		int nextroom = 1;
		String choice = "";

		while ( nextroom != 0 )
		{
			if ( nextroom == 1 )
			{
				System.out.println( "You are in a small room. There is a \"closet\", a doorway to the \"hall\", and a \"bathroom\"." );
				System.out.print( "> " );
				choice = keyboard.nextLine();
				if ( choice.equals("closet") )
					nextroom = 2;
				else if ( choice.equals("hall") )
					nextroom = 3;
				else if ( choice.equals("bathroom") )
					nextroom = 5;
				else
					System.out.println( choice + " wasn't one of the options. Try again." );
			}
			if ( nextroom == 2 )
			{
				System.out.println( "You're in a barren closet. There's nothing to do here except go \"back\"." );
				System.out.print( "> " );
				choice = keyboard.nextLine();
				if ( choice.equals("back") )
					nextroom = 1;
				else
					System.out.println( choice + " wasn't one of the options. Try again." );
			}
			if ( nextroom == 3 )
			{
				System.out.println( "You find yourself in a concrete hallway. Oddly, there is only a single" );
				System.out.println( "\"door\" visible. Otherwise, the hall just extends about fifteen feet" );
				System.out.println( "in either direction, and ends in a smooth, blank, concrete wall." );
				System.out.println( "Do you want to enter the \"door\" or approach the \"wall\" looking for clues?" );
				System.out.print( "> " );
				choice = keyboard.nextLine();
				if ( choice.equals("door") )
					nextroom = 1;
				else if ( choice.equals("wall") )
					nextroom = 4;
				else
					System.out.println( choice + " wasn't one of the options. Try again." );
			}
			if ( nextroom == 4 )
			{
				System.out.println( "Upon closer inspection, the seemingly blank wall shimmers ever so slightly" );
				System.out.println( "in the dim light. You put forward a tentative hand, and it pushes through," );
				System.out.println( "a feeling of static sliding up your arm." );
				System.out.println();
				System.out.println( "You pass through the portal into the unknown...." );
				nextroom = 0;
			}
			if ( nextroom == 5 )
			{
				System.out.println( "Inside the bathroom, there appears to be a window out of the house and a door to another room. ");
				System.out.println( "Do you jump out of the \"window\" or do you try the \"door\" to the other room?");
				System.out.print("> ");
				choice = keyboard.nextLine();
				if ( choice.equals("window") )
					nextroom = 6;
				else if ( choice.equals("door") )
					nextroom = 2;
				else 
					System.out.println( choice + " wasn't one the options. Try again.");
			}
			if ( nextroom == 6 )
			{
				System.out.println( "You muster the courage to jump, but as you approach the ground you realize that maybe you ");
				System.out.println( "jumped from too high of a height.");
				nextroom = 0;
			}

		}

		System.out.println( "\nThe game is over. The next episode can be downloaded for only 800 Microsoft points!" );
	}
	
}