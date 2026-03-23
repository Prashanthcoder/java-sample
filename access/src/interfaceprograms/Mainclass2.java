package interfaceprograms;

interface Puma{
	void shoes();
}
interface Nike extends Puma {
	void bags();
}

class RajBilling implements Puma{
	public void shoes() {
		System.out.println("Shoes");
	}
	public void bags() {
		System.out.println("bags");
	}
}
public class Mainclass2 {
	public static void main(String[] args) {
		RajBilling r1 = new RajBilling();
		r1.shoes();
		r1.bags();
	}
}
