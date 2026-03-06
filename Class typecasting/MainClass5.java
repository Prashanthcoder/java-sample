class Sample2
{
void co(){
	System.out.println("it is co......");
}
}
class Guleyluu extends Sample2
{
void disp(){
System.out.println("it is disp....");
}
}

class MainClass5 
{
	public static void main(String[] args) 
	{
	Sample2 s2 = new Guleyluu();
	s2.co();
	Guleyluu g2 = (Guleyluu)s2;
	g2.co();
g2.disp();
	}
}
