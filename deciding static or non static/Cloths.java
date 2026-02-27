class Cloths
{
static String cloth_brand = "puma";
int cloth_cost;
String cloth_colour;
String cloth_size;

public static void main(String[] args){
	Cloths c1 = new Cloths();
System.out.println("The Cloths brand : "+cloth_brand);
c1.cloth_cost = 800;
c1.cloth_colour = "red";
c1.cloth_size = "XL";

System.out.println("The cloth cost : "+c1.cloth_cost+"\ncloth colour : "+c1.cloth_colour+"\nCloth size : "+c1.cloth_size);

Cloths c2 = new Cloths();
c2.cloth_cost = 900;
c2.cloth_colour = "silver";
c2.cloth_size = "L";

System.out.println("The cloth cost : "+c2.cloth_cost+"\ncloth colour : "+c2.cloth_colour+"\nCloth size : "+c2.cloth_size);

}
}