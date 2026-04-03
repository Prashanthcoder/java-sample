package threads;
class Songs{
	public static void song1() {
		for(int i = 1;i<=10;i++) {
			try {
			Thread.sleep(500);
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
			System.out.println("kicha kicha");
		}
	}
		
	
	public static void song2() {
		for(int i = 1;i<=10;i++) {
			try {
			Thread.sleep(500);
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
			System.out.println("hucha hucha");
		}
	
	}
}
class Multithread1 extends Thread{
	public void run() {
		Songs.song1();
	}
}
class Multithread2 extends Thread{
	public void run() {
		Songs.song2();
	}
}

public class Main2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread t1 = new Thread(new Multithread1());
		Thread t2 = new Thread(new Multithread2());
		t1.start();
		t2.start();
	}
}
