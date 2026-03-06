class Cool2
{
void disp(){
	System.out.println("it is disp.....");
}
}
class Dinga extends Cool2
{
int x = 40;
void tata(){
	System.out.println("it is tata.....");
}
}

class MainClass8 
{
	public static void main(String[] args) 
	{
		Cool2 c2 = new Dinga();
		System.out.println("upcasting****");
c2.disp();
Dinga d = (Dinga)c2;
System.out.println("downcasting******");
System.out.println(d.x);
d.tata();
	}
}
