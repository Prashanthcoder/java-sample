package threads;
//using runnable interface

class Tester implements Runnable{
	public void run() {
		for(int i =0;i<=9;i++) {
			try {
				Thread.sleep(400);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("I'm a thread from runnable interface");
		}
	}
}
public class Main3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tester t1 = new Tester();
		Thread th = new Thread(t1);
		th.start();
	}

}
