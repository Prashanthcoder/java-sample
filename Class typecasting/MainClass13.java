class Chungacha2
{
int d = 29;
}
class Cola13 extends Chungacha2
{
int f = 40;
void disp(){
	System.out.println("it is disp.........");
}
}

class MainClass13 
{
	public static void main(String[] args) 
	{
		Chungacha2 c2 = new Cola13();
		System.out.println("*********upcasting****");
		System.out.println(c2.d);
		Cola13 c1 = (Cola13)c2;
		System.out.println("****downcasting********");
System.out.println(c1.d+"\n"+c1.f);
c1.disp();
		
	}
}
