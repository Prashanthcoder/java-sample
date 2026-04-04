package numbers;

public class ProdOfDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 99457651,res = 1;
		while(n!=0) {
			int digit = n%10;
			System.out.println("digit -> "+digit+" result = "+res+" * "+digit);
			res = res* digit;
			System.out.println("current prod = "+res);
			n/=10;
		}
		System.out.println("the product of each digits is : "+ res);
	}

}
