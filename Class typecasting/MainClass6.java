class Cola1
{
int f = 34;
}
class Chungacha extends Cola1
{
int d = 70;
}

class MainClass6 
{
	public static void main(String[] args) 
	{
		Cola1 c1 = new Chungacha();
System.out.println("upcasting******");
		System.out.println(c1.f);
		Chungacha cu = (Chungacha)c1;
System.out.println("downcasting********");
		System.out.println(cu.f);
System.out.println(cu.d);
	}
}
