import java.util.Random;
public class FortuneCookie
{
	public static void main ( String [] args )
	{
		Random r = new Random();
		int x = r.nextInt(6);
		String fortuneCookieOutput = "";
		if( x == 0 )
		{
			fortuneCookieOutput = "You will find happiness with a new love.";
		}
		if( x == 1 )
		{
			fortuneCookieOutput = "Stick with your wife.";
		}
		if ( x == 2 )
		{
			fortuneCookieOutput = "You will live a long life.";
		}
		if ( x == 3 )
		{
			fortuneCookieOutput = "If you work hard, you will find your way to success.";
		}
		if ( x == 4 )
		{
			fortuneCookieOutput = "You are destined to become a software engineer.";
		}
		if( x == 5 )
		{
			fortuneCookieOutput = "Get your life back together and keep at it.";
		}
		System.out.println("Fortune cookie says: \""+ fortuneCookieOutput + "\"");
		int lot1 = r.nextInt(54) + 1;
		int lot2 = 1 + r.nextInt(54);
		int lot3 = 1 + r.nextInt(54);
		int lot4 = 1 + r.nextInt(54);
		int lot5 = 1 + r.nextInt(54);
		int lot6 = 1 + r.nextInt(54);
		System.out.println("\t"+ lot1 + " - " + lot2 + " - " + lot3 + " - " + lot4 + " - " + lot5 + " - " + lot6);
	 }
}