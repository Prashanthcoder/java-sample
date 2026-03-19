package encap;
abstract class Sample{
	abstract void disp();
	abstract void test();
}
class Demo1 extends Sample{
	void disp() {
		System.out.println("hello");
	}
	void test() {
		System.out.println("hi");
	}
}

public class Mainclass1 {
	public static void main(String[] args) {
		 Demo1 name = new Demo1();
		 name.disp();
		 name.test();
	}

}
