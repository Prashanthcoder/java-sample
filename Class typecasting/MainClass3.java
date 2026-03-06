class Cool
{
void add(){
	System.out.println("it is add.......");
}
}
class Goolata extends Cool
{
void dispu(){
	System.out.println("it is dispu........");
}
}

class MainClass3 
{
	public static void main(String[] args) 
	{
		Cool c1 = new Goolata();
		System.out.println("*****upcasting********");
		c1.add();
		Goolata g1 = (Goolata)c1;
		System.out.println("*****downcasting*****");
		g1.add();
		g1.dispu();
	}
}
