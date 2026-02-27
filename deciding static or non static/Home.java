class Home
{
static String home_name = "sweet home";
int home_cost;
String home_colour;

public static void main(String[] args){
	Home h1 = new Home();
System.out.println("The home name : "+home_name);
h1.home_cost = 30000000;
h1.home_colour = "Beige";
System.out.println("The cost : "+h1.home_cost+"\nHome colour : "+h1.home_colour);
Home h2 = new Home();
h2.home_cost = 50000000;
h2.home_colour = "Aesthetci blur";
System.out.println("The cost : "+h2.home_cost+"\nHome colour : "+h2.home_colour);
}
}