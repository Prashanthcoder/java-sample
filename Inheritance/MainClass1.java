//Single level inheritance

class Sample1
{
int c=90;
}
class Demo1 extends Sample1
{
//int c = 90;
void test(){
	System.out.println("it is test...");
}
}

class MainClass1
{
public static void main(String[] args){
	Demo1 d1 = new Demo1();
System.out.println(d1.c);
d1.test();	
}
}