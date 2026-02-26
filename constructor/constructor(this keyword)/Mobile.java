class Mobile
{
int mobile_cost;
String model_name;
String model_colour;

Mobile(int mobile_cost, String model_name, String model_colour){
	this.mobile_cost = mobile_cost;
this.model_name = model_name;
this.model_colour = model_colour;
}

public static void main(String[] args){
Mobile m = new Mobile(12000, "Redmi 12 5G", "silver");
System.out.println("Mobile cost : "+m.mobile_cost+"\nmodel : "+m.model_name+"\nColour : "+m.model_colour);
}
}