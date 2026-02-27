class Laptop
{
static String laptop_brand = "Infinix";
int laptop_cost;
String laptop_name;

public static void main(String[] args){
	Laptop l1 = new Laptop();
System.out.println("The laptop brand : "+laptop_brand);
l1.laptop_cost = 25000;
l1.laptop_name = "Chrome book";
System.out.println("The laptop cost : "+l1.laptop_cost+"\nLaptop name : "+l1.laptop_name);
Laptop l2 = new Laptop();
l2.laptop_cost = 30000;
l2.laptop_name = "Gaming pc";
System.out.println("The laptop cost : "+l2.laptop_cost+"\nLaptop name : "+l2.laptop_name);
}
}