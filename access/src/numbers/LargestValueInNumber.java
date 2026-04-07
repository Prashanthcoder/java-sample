package numbers;

public class LargestValueInNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int max = Integer.MIN_VALUE;
		int n = 892834;
		while(n!=0) {
			int digit = n%10;
			System.out.println("current digit -> "+digit);
			if(max<digit) {
				System.out.println("since the digit is greater than max -> "+digit+">"+max+" updating max = "+digit);
				max = digit;
				System.out.println("max = "+max);
			}
			n/=10;
		}
		System.out.println("the largest number is "+max);
	}

}
