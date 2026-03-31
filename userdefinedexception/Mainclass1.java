package interfaceprograms;

interface Sample1{
	void disp();
	void test();
}
abstract class Demo implements Sample1{
	public void disp() {
		System.out.println("Hello");
	}
}
class Demo12 extends Demo{
	public void test() {
		System.out.println("Hi");
	}
}
public class Mainclass1 {
	public static void main(String[] args) {
		
	
	Demo12 d1 = new Demo12();
	d1.disp();
	d1.test();
}}
