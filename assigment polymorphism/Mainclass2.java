class Amazon
{
void Buy(){
	System.out.println("Buy from Amazon");
}
}
class Shoes extends Amazon
{
void Buy(){
	System.out.println("Buy shoes");
}
}
class Tshirt extends Amazon
{
void Buy(){
System.out.println("Buy Tshirt");
}
}
class Dress extends Amazon
{
void Buy(){
	System.out.println("Buy Dress");
}
}
class Stimulator
{
static void Purchase(Amazon a1){
	a1.Buy();
}
}
class Mainclass2
{
public static void main(String[] args){
	Shoes s1 = new Shoes();
Tshirt t1 = new Tshirt();
Dress d1 = new Dress();

Stimulator.Purchase(s1);
Stimulator.Purchase(t1);
Stimulator.Purchase(d1);
}
}