class Tv
{
int tv_cost;
String brand;
String type;

Tv(int tv_cost, String brand, String type){
	this.tv_cost = tv_cost;
this.brand = brand;
this.type = type;
}

public static void main(String[] args){
	Tv t =  new Tv(12000, "LG", "Smart Tv");
System.out.println("TV cost : "+t.tv_cost+"\nBrand : "+t.brand+"\nType : "+t.type);
}
}