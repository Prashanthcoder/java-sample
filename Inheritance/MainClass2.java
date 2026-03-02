//Multi level inheritance
class Sample2
{
int y = 20;
}
class Demo2 extends Sample2
{
void cool(){
System.out.println("it is cool.....");
}
}
class Test2 extends Demo2
{
int x = 90;
}

class MainClass2
{
public static void main(String[] args){
	Test2 t1 = new Test2();
System.out.println("y from superclass : "+t1.y);
System.out.print("method cool() from demo2 subclass ");
t1.cool();
System.out.println("x from its test2 subclass : "+t1.x);
	
}
}