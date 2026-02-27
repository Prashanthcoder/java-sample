class Tv
{
static String tv_brand = "LG";
int tv_cost;
String tv_type;

public static void main(String[] args){
	Tv t1 = new Tv();
System.out.println("The Tv brand : "+tv_brand);
t1.tv_cost = 12000;
t1.tv_type = "Manual";
System.out.println("The tv t1 cost : "+t1.tv_cost +"\ntv type : "+t1.tv_type);
Tv t2 = new Tv();
t2.tv_cost = 15000;
t2.tv_type = "Smart";
System.out.println("the tv t2 cost : "+t2.tv_cost +"\ntv type : "+t2.tv_type);
}
}