package abstractclass;


abstract class Sample{
	abstract void add();
	void multiply() {
		int a = 4, b = 10;
		System.out.println(a*b);
	}
}

class Sample1 extends Sample{
	void add() {
		int a = 4, b = 2;
		System.out.println(a+b);
	}
}
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Sample1 s1 = new Sample1();
//		
//		s1.add();
//		s1.multiply();
		Sampleu s1 = new Ayyaleppa();
		
		s1.add();
		s1.mult();
	}

}

interface Sampleu{
	 void add();
	 void mult();
}

abstract class Manju implements Sampleu{
	public void add() {
		System.out.println("this is add method");
	}
	
}
class Ayyaleppa extends Manju{
	public void mult() {
		System.out.println(" this is mulitply method");
	}
}


//void shoes, void shirts of class Puma 
//void shoes, void shirts of interface Puma, demonstrate abstraction