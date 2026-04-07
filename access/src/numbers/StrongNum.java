package numbers;

public class StrongNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 145;
		int original = n;
		int sum =0;
		
		while(n!=0) {
			int digit = n%10;
			int fact =1;
			if(digit == 0 || digit == 1) {
				System.out.println("sum -> "+sum+" + "+digit);
				sum = sum +digit;
				System.out.println("sum = "+sum);
			}else {
				for(int i =digit;i>=1;i--) {
					fact = fact*i;
				}
				System.out.println("fact("+digit+") = "+fact);
				System.out.println("sum -> "+sum+"+"+fact);
				sum = sum +fact;
				System.out.println("sum = "+sum);
			}
			n/=10;
			
		}
		System.out.println("the sum of factorial of each digit "+sum);
		System.out.println(original == sum?"it is strong number":"it is not a strong number");
	}

}
