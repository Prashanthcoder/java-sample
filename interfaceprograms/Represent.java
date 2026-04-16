package interfaceprograms;

class Flipkart{
	void buy() {
		System.out.println("buying from flipkart");
	}
}

class Laptop extends Flipkart{
	void buy(){
		System.out.println("buying laptop");
	}
}

class Mobile extends Flipkart{
	void buy(){
		System.out.println("buying mobile");
	}
}

class Bag extends Flipkart{
	void buy() {
		System.out.println("buying bag");
	}
}
class Button{
	static void clickBuy(Flipkart f1) {
		f1.buy();
//		Mobile m = new Mobile();
//		m.buy();
//		Laptop l = new Laptop();
//		l.buy();
	}
}


public class Represent {

	public static void main(String[] args) {
		Mobile m1 = new Mobile();
		Bag b2 = new Bag();
		Laptop l1 = new Laptop();
		Button.clickBuy(b2);

	}

}
