class Bike
{
double bike_cost;
String bike_brand;
String bike_color;

Bike(double bc, String bb, String boc){
	bike_cost = bc;
bike_brand = bb;
bike_color = boc;
}

public static void main(String[] args){
Bike b = new Bike(1000000, "Kawasaki", "Green");
System.out.println("Bike Cost : "+ b.bike_cost+"\nBrand : "+b.bike_brand+"\nColor : "+b.bike_color);
}}
