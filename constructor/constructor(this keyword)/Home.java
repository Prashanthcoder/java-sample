class Home
{
String home_name;
int home_cost;
String home_color;

Home(String home_name, int home_cost, String home_color){
this.home_name = home_name;
this.home_cost = home_cost;
this.home_color = home_color;
}
public static void main(String[] args){
	Home h  = new Home("Sweet home", 1000000000, "Aesthetic biege");
System.out.println("Home name : "+h.home_name+"\nCost : "+h.home_cost+"\nColour : "+h.home_color);
}
}