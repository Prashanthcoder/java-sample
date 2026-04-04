package numbers;

public class CountOfDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count =0, n=99466728, original = n;
		while(n!=0) {
			count++;
			n/=10;
			
		}
		System.out.println("the total numbers of the digits in "+ original+ " is "+ count);
	}

}
