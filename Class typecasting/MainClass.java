class Demo
{
int x = 50;
}
class PemoCha extends Demo
{
void ho(){
	System.out.println("it's hoooo....");
}
}
class MainClass
{
public static void main(String[] args){
	Demo d1 = new PemoCha();
	System.out.println("**********upcasting**");
	System.out.println(d1.x);
	System.out.println("************downcasting***");
	PemoCha p1 = (PemoCha)d1;
	System.out.println(p1.x);
	p1.ho();
}
}