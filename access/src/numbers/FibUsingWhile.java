package numbers;
import java.util.*;
public class FibUsingWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the range till you need the series");
		int n = sc.nextInt();
		int fib1=0, fib2 =1, fib3=0, i=2;
		System.out.print(fib1+ " "+fib2+" ");
		while(i<=n) {
			fib3 = fib1+fib2;
			System.out.print(fib3+" ");
			fib1 = fib2;
			fib2 = fib3;
			i++;
		}
		
	}

}
