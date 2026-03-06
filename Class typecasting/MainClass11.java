class Demo10
{
double z = 1023.33;
int r = 7;
}
class Dumtaka3 extends Demo10
{
int x = 29;
}
class MainClass11 
{
	public static void main(String[] args) 
	{
		Demo10 d1 = new Dumtaka3();
		System.out.println("**upcasting**********");
System.out.println(d1.z+"\n"+d1.r);
System.out.println("*****downcasting**********");
Dumtaka3 d3 = (Dumtaka3)d1;
System.out.println(d3.z+"\n"+d3.r+"\n"+d3.x);
	}
}
