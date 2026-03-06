class Tester1
{
int x = 20;
void disp(){
	System.out.println("it is disp.....");
}
}
class Huliyacha extends Tester1
{
void ho(){
	System.out.println("it is ho....");
}
}

class MainClass7 
{
	public static void main(String[] args) 
	{
		Tester1 t1 = new Huliyacha();
		System.out.println("upcasting*****");
		System.out.println(t1.x);
		t1.disp();
		Huliyacha h = (Huliyacha)t1;
		System.out.println("downcasting******");
		System.out.println(h.x);
h.disp();
h.ho();
	}
}
