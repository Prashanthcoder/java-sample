class Car
{
static String model_name = "Rolex";
int car_cost;
String type;

public static void main(String[] args){
	Car c1 = new Car();
System.out.println("The car brand is "+model_name);
c1.car_cost = 100000;
c1.type = "petrol";
System.out.println("The car cost : "+c1.car_cost+" and type : "+c1.type);
System.out.println("The 2nd car for sale ");
Car c2 = new Car();
c2.car_cost = 120000;
c2.type = "diesel";
System.out.println("The car cost : "+c2.car_cost+" and type : "+c2.type);
}

}