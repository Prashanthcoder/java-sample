package numbers;

public class WithParam {
	static int summation(int n) {
		int sum =0;
		while(n>0) {
			int digit = n%10;
			System.out.println(" sum -> "+ sum +" + "+  digit);
			sum = sum + digit;
			System.out.println("sum = "+sum);
			n/=10;
		}
		return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(summation(894287));
	}

}
