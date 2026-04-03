package threads;

class Swiggy{
	synchronized public static void preparefood() {
		for(int i =1;i<=10;i++) {
			try {
				Thread.sleep(400);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("food prepared "+i);
		}
	}
	
	synchronized public static void deliverfood() {
		for(int i =1;i<=10;i++) {
			try {
				Thread.sleep(400);
			}catch(InterruptedException e){
				e.printStackTrace();
			}
			
			System.out.println("delivering food ... "+i);
		}
		
	}
	
	
}

class FoodTracker implements Runnable{
	public void run() {
		Swiggy.preparefood();
	}
}

class FoodTracker1 implements Runnable{
	public void run() {
		Swiggy.deliverfood();
	}
}
public class RunMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FoodTracker ft = new FoodTracker();
		FoodTracker1 ft1 = new FoodTracker1();
		Thread t1 = new Thread(ft);
		Thread t2 = new Thread(ft1);
		t1.start();
		t2.start();
		
		
	}

}
