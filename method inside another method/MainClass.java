//method inside another method , non static and between classes how to access?
class Sample1
{
void disp1(){
	System.out.println("it is disp1...");

}
}
class Sample2
{
void disp2(){
	System.out.println("it is disp2...");
Sample1 s1 = new Sample1();
s1.disp1();
}
}
class Sample3
{
void disp3(){
	System.out.println("it is disp3...");
Sample2 s2 = new Sample2();
s2.disp2();
}
}
class Sample4
{
void disp4(){
	System.out.println("it is disp4...");
Sample3 s3 = new Sample3();
s3.disp3();
}
}
class MainClass
{
public static void main(String[] args){
	Sample4 s4 = new Sample4();
s4.disp4();
}
}