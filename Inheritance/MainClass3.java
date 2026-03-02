class Sample3
{
int a = 39;
}
class Demo3 extends Sample3
{
void test(){
	System.out.println("it is from demo 3 test() method");
}
}
class Tester3 extends Sample3
{
void po(){
	System.out.println("it is from tester 3 po() method");
}
}
class MainClass3
{
public static void main(String[] args)
{
Tester3 t1 = new Tester3();
Demo3 d1 = new Demo3();
System.out.println("*************Demo3*************");
System.out.println(d1.a);
d1.test();
System.out.println("**************Tester3***********");
System.out.println(t1.a);
t1.po();
}
}






