class Cloths
{
String cloth_colour;
int cloth_cost;
String cloth_size;

Cloths(String cloth_colour, int cloth_cost, String cloth_size){
	this.cloth_colour = cloth_colour;
this.cloth_cost = cloth_cost;
this.cloth_size = cloth_size;

}

public static void main(String[] args){
	Cloths c1 = new Cloths("Black", 1000, "L");

System.out.println("Cloth colour : "+c1.cloth_colour+"\nCost : "+c1.cloth_cost+"\nSize : "+c1.cloth_size);
}
}