class Sample5
{
int x = 90;
}
class Demo5 extends Sample5
{
int y = 97;
}
class Tester5 extends Demo5
{
void display(){
	System.out.println("It is from tester 5 class ");
}
}
class Cool5 extends Sample5
{
int z = 20;
}
class MainClass4
{
public static void main(String[] args){
	Tester5 t1 = new Tester5();
	Cool5 c1 = new Cool5();
	System.out.println("**************this hybrid inheritance***********");
System.out.println("from mulitlevel in hybrid "+t1.x+" "+t1.y);
t1.display();
System.out.println("from hierarchical inheritance "+c1.x+" "+c1.z);
}
}