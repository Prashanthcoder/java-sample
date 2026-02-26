class Cloths
{
String cloth_colour;
int cloth_cost;
String cloth_size;

Cloths(String cc, int co, String cs){
	cloth_colour = cc;
cloth_cost = co;
cloth_size = cs;
}

public static void main(String[] args){
	Cloths c = new Cloths("Black", 500, "M");
System.out.println("Cloths colour : " + c.cloth_colour+ "\nCost : "+c.cloth_cost+"\nCloth size : "+c.cloth_size);
}

}