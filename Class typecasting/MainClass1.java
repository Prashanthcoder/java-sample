class Sample
{
void disp(){
	System.out.println("this is from disp.....");
}
}
class Ampules extends Sample
{
void tata(){
	System.out.println("it is tata.....");
}
}
class MainClass1
{
public static void main(String[] args){
	Sample s1 = new Ampules();
System.out.println("**************upcasting***********");
s1.disp();
System.out.println("********downcasting*************");
Ampules a1 = (Ampules)s1;
a1.disp();
a1.tata();
}
}