class Home
{
String home_name;
int home_cost;
String home_color;

Home(String hn, int hc, String hco){
	home_name = hn;
home_cost = hc;
home_color = hco;
}

public static void main(String[] args){
	Home h = new Home("Sweet home", 1500000, "aesthetic beige");
System.out.println("Home name : "+h.home_name+"\nHome cost : "+h.home_cost+"\nHome color : "+h.home_color);
}
}