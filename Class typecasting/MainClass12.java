class Sample21
{
void co(){
	System.out.println("it is co.......");
}

}
class Hahoha extends Sample21
{
void disp(){
	System.out.println("it is disp.....");
}
}

class MainClass12 
{
	public static void main(String[] args) 
	{
		Sample21 s2 = new Hahoha();
System.out.println("****upcasting******");
s2.co();
Hahoha h = (Hahoha)s2;
System.out.println("******downcasting*******");
h.disp();
h.co();
	}
}
