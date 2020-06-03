public class MoreVariablesAndPrinting
{
    public static void main( String[] args )
    {
        String name, eyeColor, teethColor, hairColor;
        int age, height, weight;
	double heightConversion, weightConversion;

        name = "Richard Zhang";
        age = 14;     // not a lie
        height = 68;  // inches
        weight = 120; // lbs
        eyeColor = "Brown";
        teethColor = "White";
        hairColor = "Black";
	heightConversion=height*2.54;
	weightConversion=Math.round(weight*0.453592);

        System.out.println( "Let's talk about " + name + "." );
        System.out.println( "He's " + height + " inches or ("+heightConversion+") centimeters tall." );
        System.out.println( "He's " + weight + " pounds or ("+weightConversion+") kilograms heavy." );
        System.out.println( "Actually, that's not too heavy." );
        System.out.println( "He's got " + eyeColor + " eyes and " + hairColor + " hair." );
        System.out.println( "His teeth are usually " + teethColor + " depending on the coffee." );

        // This line is tricky; try to get it exactly right.
        System.out.println( "If I add " + age + ", " + height + ", and " + weight
            + " I get " + (age + height + weight) + "." );
    }
}