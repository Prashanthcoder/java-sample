package assignment7_4_26;

public class ProductOfNonPrime {

	static boolean prime(int n) {
		if(n<=1) {
			return false;
		}
		for(int i = 2;i*i<=n;i++) {
			if(n%i==0) {
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int prod = 1;
		int n =8462771;
		while(n!=0) {
			int digit = n%10;
			if(prime(digit)==false) {
				System.out.println("since the "+digit+" is non prime number multiply it buddy");
				System.out.print("prod -> "+prod +"*"+digit);
			prod = prod * digit;
			System.out.println(" storing it in |"+prod+"| -> prod");
			}else {
				System.out.println("since "+digit+" is prime ignore it");
			}
			n/=10;
		}
	}

}
