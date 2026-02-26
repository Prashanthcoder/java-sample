class Laptop
{
String laptop_name;
int laptop_cost;
String laptop_brand;

Laptop(String laptop_name, int laptop_cost, String laptop_brand){
	this.laptop_name = laptop_name;
this.laptop_cost = laptop_cost;
this.laptop_brand = laptop_brand;

}

public static void main(String[] args){
	Laptop l = new Laptop("Infinix y1 neo", 24000, "New latest");
System.out.println("Laptop name : "+l.laptop_name+"\nCost : "+l.laptop_cost+"\nBrand : "+l.laptop_brand);
}
}