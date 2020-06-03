import java.util.Scanner;

public class LetterAtATime
{
	public static void main( String[] args )
	{
		Scanner kb = new Scanner(System.in);

		System.out.print("What is your message? ");
		String message = kb.nextLine();

		System.out.println("\nYour message is " + message.length() + " characters long.");
		System.out.println("The first character is at position 0 and is '" + message.charAt(0) + "'.");
		int lastpos = message.length() - 1;
		System.out.println("The last character is at position " + lastpos + " and is '" + message.charAt(lastpos) + "'.");
		System.out.println("\nHere are all the characters, one at a time:\n");
		// if changed to i<=message.length() a "string index out of bounds exception" will occur because length() starts at 1 and charAt() starts at 0(loop runs one extra unneccesary time when <= is switched in)
		// this means that there will be no character when the loop reaches the final number from length(needs to start at 0 and end at the message length - 1) to run through all the indexes of the characters in message
		// the length() of a variable with the string "box" is 3, but the position of the last character(the 'x') is 2 as the index starts at 0 instead of 1(with length)
		for ( int i=0; i<message.length(); i++ )
		{
			System.out.println("\t" + i + " - '" + message.charAt(i) + "'");
		}

		int vowelCount = 0;

		for ( int i=0; i<message.length(); i++ )
		{
			char letter = message.charAt(i);
			if ( letter == 'a' || letter == 'A' || letter == 'e' || letter == 'E' || letter == 'i' || letter == 'I' || letter == 'o' || letter == 'O' || letter == 'u' || letter == 'U')
			{
				vowelCount++;
			}
		}

		System.out.println("\nYour message contains " + vowelCount + " vowels. Isn't that interesting?");

	}
}