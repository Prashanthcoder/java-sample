package practice27_05;

import java.util.Scanner;

public class Fibbanoci {
	public static void main(String[] args) {
		int fib1 =0, fib2 = 1, fib3;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number of series you want?");
		int n = sc.nextInt();
		int i =0;
		System.out.print(fib1+ " "+fib2+" ");
		while(i<n-2) {
			fib3 = fib1 + fib2;
			fib1 = fib2;
			fib2 = fib3;
			System.out.print(fib3+" ");
			i++;
		}
	}
}
