package problemsqspider;

public class PrimeNumber {
	static void primeCheck(int num) {
		boolean flag=true;
		if(num<=1) {
			flag = false;
		}
		if(num==2) {
			flag = true;
		}
		if(num%2==0) {
			if(num==2) {
				flag = true;
				;
			}
			flag = false;
		}
		for(int i = 3;i*i<=num;i+=2) {
			if(num%i==0) {
				
				flag = false;
				break;
			}
		}
		if(flag) {
			System.out.println("It is prime number");
		}else {
			System.out.println("it is not a prime number");
		}
		
	}
}
