package threads;
class Bank{
	static int balance = 1000;
	public static void withdraw(int amount) {
		balance -= amount;
		System.out.println("withdraw successful "+balance);
	}
	
	public static void deposit(int amount) {
		balance+= amount;
		System.out.println("Amount deposited "+balance);
	}
}

class Depo extends Thread{
	public void run() {
		Bank.deposit(400);
	}
}
class WithdrawThread extends Thread{
	public void run() {
		Bank.withdraw(300);
	}
}
public class Main4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Depo().start();
		new WithdrawThread().start();

	}

}
