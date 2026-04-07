package assignment7_4_26;


public class PrimeEven {
	static boolean prime(int n) {
		if(n<=1) {
			return false;
		}
		for(int i =2;i*i<=n;i++) {
			if(n%i==0) {
				return false;
			}
		}
		return true;
	
	}
	public static void main(String[] args) {
		
		int n = 123456789;
		int sum =0;
		while(n!=0) {
			int digit = n%10;
			if(prime(digit)) {
					System.out.println("since the number "+digit+" is a prime add it here");
					System.out.println("sum -> "+sum + " +"+ digit);
					sum = sum +digit;
					System.out.println("sum = "+ sum);
			}
			n/=10;
		}
	}
}

//write a program to check whether the given number is strong number or not!
//write a program to find the product of onluy non prime numbers in the given numbers
//write a program to find the 1st largest value in the given numbers;s