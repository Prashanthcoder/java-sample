class Tester3
{
int r = 7;
void disp(){
	System.out.println("it is disp....");
}
}
class Tista1 extends Tester3
{
void uliya(){
	System.out.println("it is uliya....");
}
}

class MainClass9 
{
	public static void main(String[] args) 
	{
		Tester3 t3 = new Tista1();
System.out.println("****upcasting*****");
System.out.println(t3.r);
t3.disp();
Tista1 t1 = (Tista1)t3;
System.out.println("*****downcasting****");
System.out.println(t1.r);
t1.disp();
t1.uliya();
	}
}
