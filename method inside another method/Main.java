class Demo1
{
static void disp1(){
	System.out.println("it is disp1..");
}
}
class Demo2
{
static void disp2(){
	System.out.println("it is disp2..");
Demo1.disp1();
}
}
class Demo3
{
static void disp3(){
	System.out.println("it is disp3..");
Demo2.disp2();
}
}
class Demo4
{
static void disp4(){
	System.out.println("it is disp4..");
Demo3.disp3();
}
}
public class Main
{
public static void main(String[] args){
	Demo4.disp4();
}
}