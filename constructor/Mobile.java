class Mobile{
double mobile_cost;
String mobile_model;
String mobile_color;

Mobile(double mc, String mm, String mo){
	mobile_cost = mc;
	mobile_model = mm;
	mobile_color = mo;
}

public static void main(String[] args){
	Mobile m = new Mobile(12000.50, "Redmi 12 5G", "silver");
	System.out.println("Cost: "+m.mobile_cost+" Model : "+m.mobile_model+" color: "+m.mobile_color);
}
}