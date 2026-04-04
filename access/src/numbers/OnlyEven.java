package numbers;

import java.util.Scanner;

public class OnlyEven {
	static int OnlyEvenSum(int n) {
		int sum =0;
		while(n!=0) {
			int digit = n%10;
			
			if(digit%2==0) {
				System.out.println("digit-> "+digit+" an even so add it\nsum -> "+sum+" + "+ digit);
				sum = sum + digit;
				System.out.println("sum -> "+sum);
			}else {
				System.out.println("digit-> "+digit+" an odd so ignored it");
			}
			n/=10;
		}
		return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number to get summation of their digits ");
		int n = sc.nextInt();
		OnlyEvenSum(n);
	}

}
