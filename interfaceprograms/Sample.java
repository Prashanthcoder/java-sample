package interfaceprograms;

interface New{
	void disp();
	void test();
}
class Demo1 implements New{
	public void disp() {
		System.out.println("Hello");
	}
	public void test() {
		System.out.println("hi");
	}
}
public class Sample{
	public static void main(String[] args) {
		Demo1 d1 = new Demo1();
		d1.disp();
		d1.test();
	}
}
