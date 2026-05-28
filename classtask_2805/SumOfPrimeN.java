package classtask_2805;

public class SumOfPrimeN{
	public static boolean isprime(int n) {
		if(n<=1) return false;
		for(int i = 2;i*i<=n;i++) {
			if(n%i==0) {
				return false;
			}
		}
		
		return true;
		
	}
	public static void main(String[] args) {
		
		//to find the sum of prime numbers between the range
		int sum =0;
		int range = 25;
		for(int i =1;i<=range;i++) {
			if(isprime(i)) {
				System.out.print(i+" ");
				sum = sum +i;
			}
		}
		System.out.println(" \nThe sum of the digists are: "+sum);
	}
}