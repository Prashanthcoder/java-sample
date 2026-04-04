package numbers;

import java.util.Scanner;

public class OnlyEvenProduct {
	static int OnlyEvenProd(int n) {
		int res =1;
		while(n!=0) {
			int digit = n%10;
			
			if(digit%2==0) {
				System.out.println("digit-> "+digit+" an even so multiply it\res -> "+res+" * "+ digit);
				res = res * digit;
				System.out.println("result -> "+res);
			}else {
				System.out.println("digit-> "+digit+" an odd so ignored it");
			}
			n/=10;
		}
		return res;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number to get summation of their digits ");
		int n = sc.nextInt();
		OnlyEvenProd(n);
	}

}
