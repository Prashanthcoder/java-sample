class Bike
{
static String bike_brand = "Kawasaki";
int bike_cost;
String bike_colour;

public static void main(String[] args){
	Bike b1 = new Bike();
System.out.println("The bike : "+bike_brand);
b1.bike_cost = 10000000;
b1.bike_colour = "Green";
System.out.println("The bike cost : "+b1.bike_cost+"\nBike colour : "+b1.bike_colour);
Bike b2 = new Bike();
b2.bike_cost = 2000000;
b2.bike_colour = "maroon";
System.out.println("The bike cost : "+b2.bike_cost+"\nBike colour : "+b2.bike_colour);
}
}