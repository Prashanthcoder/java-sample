package numbers;

public class DiariumNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 135;
		int original = n;
		int digits = 0, sum =0;
		int temp = n;
		while(temp!=0) {
			digits++;
			temp/=10;
		}
		temp = n;
		while(temp!=0) {
			int digit = temp%10;
			sum += Math.pow(digit, digits);
			digits--;
			temp/=10;
			}
		
		System.out.println("sum = "+sum);
		if(original == sum) {
			System.out.println("it is a diarium number");
		}else {
			System.out.println("it is not a diarium number");
		}
	}

}
