package threads;


class Sample extends Thread{
	public void run(){
		for(int i = 1;i<=10;i++) {
			try {
			Thread.sleep(500);
		}catch(InterruptedException e) {
			System.out.println("handled");
		}
			System.out.println(i);
		}
	}
}
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sample s1 = new Sample();
		s1.start();
	}

}
