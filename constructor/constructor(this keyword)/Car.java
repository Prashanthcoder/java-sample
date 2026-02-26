class Car
{
int car_cost;
String model_name;
String car_type;

Car(int car_cost, String model_name, String car_type){
	this.car_cost = car_cost;
this.model_name = model_name;
this.car_type = car_type;
}

public static void main(String[] args){
	Car c = new Car(1000000, "Rolex", "Petrol");
System.out.println("Car cost : "+c.car_cost+"\nmodel : "+c.model_name+"\nType : "+c.car_type);
}
}