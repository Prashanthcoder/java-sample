package numbers;

public class SumOfDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 99457651, sum =0;
		while(n!=0) {
			int digit = n%10;
			System.out.println("digit -> "+digit+" sum = "+sum+" + "+digit);
			sum = sum+ digit;
			System.out.println("current sum = "+sum);
			n/=10;
		}
		System.out.println("the sum of each digits are : "+ sum);
	}

}
