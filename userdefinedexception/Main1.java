package interfaceprograms;
interface LG{
	void Buy();
}
class TV implements LG{
	public void Buy() {
		System.out.println("Bought Tv");
	}
}
class Fridge implements LG{
	public void Buy() {
		System.out.println("bought fridge");
	}
}
class WashingMachine implements LG{
	public void Buy() {
		System.out.println("bought washing machine");
	}
}
class Sim{
	static void onsim(LG l) {
		l.Buy();
	}
}
public class Main1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fridge f = new Fridge();
		TV t = new TV();
		WashingMachine w = new WashingMachine();
		Sim.onsim(f);
		Sim.onsim(w);
		Sim.onsim(t);
	}

}
