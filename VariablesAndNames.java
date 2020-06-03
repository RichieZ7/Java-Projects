public class VariablesAndNames
{
    public static void main( String[] args )
    {
        int cars, drivers, passengers, cars_not_driven, cars_driven;
        double space_in_a_car, carpool_capacity, average_passengers_per_car;
	//int 
        cars = 100;
	//4.0 better fits into the double type, as if it was 4, it would be better as an int type variable(no big difference on code however)
	//floating point=decimal
	//double
        space_in_a_car = 4.0;
	//int
        drivers = 30;
	//int
        passengers = 90;
	//int
        cars_not_driven = cars - drivers;
	//int
        cars_driven = drivers;
	//double
        carpool_capacity = cars_driven * space_in_a_car;
	//double
        average_passengers_per_car = passengers / cars_driven;


        System.out.println( "There are " + cars + " cars available." );
        System.out.println( "There are only " + drivers + " drivers available." );
        System.out.println( "There will be " + cars_not_driven + " empty cars today." );
        System.out.println( "We can transport " + carpool_capacity + " people today." );
        System.out.println( "We have " + passengers + " to carpool today." );
        System.out.println( "We need to put about " + average_passengers_per_car + " in each car." );
    }
}