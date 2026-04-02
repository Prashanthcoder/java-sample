package numbers;
//write a program to generate fibonacci seriesd
import java.util.*;
public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the range till you want to print it");
		int n = sc.nextInt();
		int a = 0, b =1;
		int fib =0;
		
		System.out.print(a+" "+b+" ");
		for(int i =2;i<=n;i++) {
			fib =  a+b;
			System.out.print(fib+" ");
			a = b;
			b = fib;
		}
		
	}

}