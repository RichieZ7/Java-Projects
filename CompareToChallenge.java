public class CompareToChallenge
{
	public static void main ( String[] args )
	{
		System.out.println("Negative values: \n");
		System.out.print("Comparing \"axe\" with \"dog\" produces ");
		System.out.println("axe".compareTo("dog"));
		System.out.print("Comparing \"barn\" with \"yard\" produces ");
		System.out.println("barn".compareTo("yard"));
		System.out.print("Comparing \"aaaaa\" with \"aaaaaaa\" produces ");
		System.out.println("aaaaa".compareTo("aaaaaaa"));
		System.out.print("Comparing \"fire\" with \"firehouse\" produces ");
		System.out.println("fire".compareTo("firehouse"));
		System.out.print("Comparing \"axe\" with \"DOG\" produces ");
		System.out.println("axe".compareTo("dog"));
	
		System.out.println();
		System.out.println("Positive values: \n");
		System.out.print("Comparing \"car\" with \"bee\" produces ");
		System.out.println("car".compareTo("bee"));
		System.out.print("Comparing \"zebra\" with \"yard\" produces ");
		System.out.println("zebra".compareTo("yard"));
		System.out.print("Comparing \"aaaaa\" with \"aaaaaaa\" produces ");
		System.out.println("aaaaa".compareTo("aa"));
		System.out.print("Comparing \"fire\" with \"firehouse\" produces ");
		System.out.println("firetruck".compareTo("firehouse"));
		System.out.print("Comparing \"axe\" with \"ape\" produces ");
		System.out.println("axe".compareTo("ape"));

		System.out.println();
		System.out.println("Null values: \n");		
		System.out.print("Comparing \"car\" with \"car\" produces ");
		System.out.println("car".compareTo("car"));
		System.out.print("Comparing \"zebra\" with \"zebra\" produces ");
		System.out.println("zebra".compareTo("zebra"));
		}
}