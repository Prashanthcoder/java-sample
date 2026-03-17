class LG
{
void select(){
	System.out.println("Select LG");
}
}
class Television extends LG{

void select(){
	
System.out.println("Select Television");
}	
}
class Mobiles extends LG
{
void select(){
	System.out.println("Select Mobiles");
}
}
class Refrigerator extends LG
{
void select(){
	System.out.println("Select Refrigerator");
}
}
class Stimulator
{
static void Buy(LG l1){
	l1.select();
}
}
class Mainclass1
{
public static void main(String[] args){
	Television t1 = new Television();
Mobiles m1 = new Mobiles();
Refrigerator r1 = new Refrigerator();

Stimulator.Buy(t1);
Stimulator.Buy(m1);
Stimulator.Buy(r1);
}
}