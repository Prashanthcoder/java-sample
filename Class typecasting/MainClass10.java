class Cool4
{
void add(){
	System.out.println("it is add .......");
}
}
class Goolata2 extends Cool4
{
void dispu(){
	System.out.println("it is dispu.....");
}
int r = 29;
}

class MainClass10 
{
	public static void main(String[] args) 
	{
	Cool4 c4 = new Goolata2();
System.out.println("*****upcasting****");
c4.add();
System.out.println("***downcasting*****");
Goolata2 g2 = (Goolata2)c4;
g2.add();
g2.dispu();
System.out.println(g2.r);
}}