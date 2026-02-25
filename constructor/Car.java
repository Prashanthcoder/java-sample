class Car
{
double car_cost;
String model;
String type;

Car(double cc, String m, String t){
	car_cost = cc;
	model = m;
	type = t;
}

public static void main(String[] args){
	Car m = new Car(1200000.00, "Rolex", "petrol");
	System.out.println(" Car cost: "+m.car_cost+"\n model : "+m.model+"\n type : "+m.type);
}
}