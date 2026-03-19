package encap;

abstract class Sample2{
	abstract void disp();
	abstract void test();
}
abstract class Demo2 extends Sample2{
	abstract void test();
	void disp() {
		System.out.println("Hello");
	}
}
class Demo3 extends Demo2{
	void test() {
		System.out.println("Hi");
	}
}
public class Mainclass2 {
	public static void main(String[] args) {
		Demo3 d3 = new Demo3();
		d3.disp();
		d3.test();
	}
}
