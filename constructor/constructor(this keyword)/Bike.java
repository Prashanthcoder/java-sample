class Bike
{
int bike_cost;
String bike_brand;
String color;

Bike(int bike_cost, String bike_brand, String color){
	this.bike_cost = bike_cost;
this.bike_brand = bike_brand;
this.color = color;
}

public static  void main(String[] args){
	Bike b = new Bike(200000, "Kawasaki", "Green");
System.out.println("Bike cost : "+b.bike_cost+"\nBrand : "+b.bike_brand+"\nColour : "+b.color);
}
}