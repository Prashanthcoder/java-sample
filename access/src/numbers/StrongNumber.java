package numbers;

public class StrongNumber {

	static int fact(int n) {
		int fact = 1;
		if(n==0||n==1) {
			return 1;
		}
		for(int i=n;i>=1;i--) {
			fact = fact*i;
		}
		return fact;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 145;
		int original = n;
		int sum =0;
		while(n!=0) {
			int digit = n%10;
			sum = sum + fact(digit);
			n/=10;
		}
		System.out.println(original==sum?sum+" is a strong number":sum+" is not a strong number");
		
	}

}
