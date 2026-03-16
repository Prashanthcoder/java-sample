class Demo1
{
double x = 34;
}
class Dumtaka extends Demo1
{
int x = 23;
void disp(){
	System.out.println("parent x : "+super.x);
}
}

class MainClass4 
{
	public static void main(String[] args) 
	{
Demo1 d1 = new Dumtaka();
System.out.println("****upcasting****");
System.out.println(d1.x);
Dumtaka du = (Dumtaka)d1;
System.out.println("****downcasting***");
du.disp();
System.out.println(du.x);	
	}
}
