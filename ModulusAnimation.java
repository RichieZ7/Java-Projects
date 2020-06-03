public class ModulusAnimation
{
	public static void main( String[] args ) throws Exception
	{
		for ( int i=0; i<80; i++ )
		{
			if ( i%10 == 0 )
			{
				System.out.print(" Richard is cool. \r");
			}
			else if( i%10 == 1)
			{
				System.out.print("l.  Richard is coo \r");
			}
			else if( i%10 == 2)
			{
				System.out.print("ol.  Richard is co \r");
			}
			else if( i%10 == 3)
			{
				System.out.print("00l.  Richard is c \r");
			}

			else if( i%10 == 4)
			{
				System.out.print("cool.  Richard is \r");
			}
			else if( i%10 == 5)
			{
				System.out.print(" cool.  Richard is\r");
			}
			else if( i%10 == 6)
			{
				System.out.print("s cool.  Richard i\r");
			}
			else if( i%10 == 7)
			{
				System.out.print("is cool.  Richard  \r");
			}
			else if( i%10 == 8)
			{
				System.out.print("ard is cool.  Rich\r");
			}		
			else if( i%10 == 9)
			{
				System.out.print("ichard is cool.  R\r");
			}	
			Thread.sleep(200);
		}
		
	}
}