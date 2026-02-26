class Laptop
{
String lap_name;
int lap_cost;
String lap_brand;

Laptop(String ln, int lc, String lb){
	lap_name = ln;
lap_cost = lc;
lap_brand = lb;

}

public static void main(String[] args){
	Laptop l = new Laptop("Infinix y1 neo", 24000, "Infinix");
System.out.println("Laptop name : "+l.lap_name+"\nLaptop cost : "+l.lap_cost+"\nLaptop brand : "+l.lap_brand);
}
}