package abstraction;

interface animal{
	void noise();
}

class dog implements animal{
	public void noise() {
		System.out.println("Bow bow bow");
	}
}
class cat implements animal{
	public void noise() {
		System.out.println("meow meow meow");
	}
}
class snake implements animal{
	public void noise() {
		System.out.println("tuss buss puss");
	}
}
class Simulator{
	public static void onsim(animal a1) {
		a1.noise();
	}
}

public class Mainclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		cat c1 = new cat();
		dog d1 = new dog();
		snake s1 = new snake();
		Simulator.onsim(c1);
		Simulator.onsim(d1);
		Simulator.onsim(s1);
	}

}
