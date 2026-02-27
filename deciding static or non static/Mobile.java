class Mobile
{
static String model_name = "Redmi 12 5G";
int mobile_cost;
String mobile_colour;

public static void main(String[] args){
	Mobile m1 = new Mobile();
System.out.println("The Mobile model : "+model_name);
m1.mobile_cost = 12000;
m1.mobile_colour = "Silver";
System.out.println("Mobile model cost for m1 : "+m1.mobile_cost+" colour is "+m1.mobile_colour);
System.out.println("2nd mobile cost and colour: ");
Mobile m2 = new Mobile();
m2.mobile_cost = 15000;
m2.mobile_colour = "Black";
System.out.println("Mobile model cost for m2 : "+m2.mobile_cost+" colour is "+m2.mobile_colour);

}
}