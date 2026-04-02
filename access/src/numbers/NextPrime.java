package numbers;
import java.util.*;
public class NextPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number to find the next prime number next to it");
		int n = sc.nextInt();
		for(int j = n+1;j<=Integer.MAX_VALUE;j++) {
		boolean f = true; n = j;
		if(n<=1) {
			f = false;
		}else {
			for(int i =2;i*i<=n;i++) {
				if(n%i==0) {
					f = false;
					break;
				}
			}
		}
		
		if(f) {
			System.out.println(n);
			break;
		}
	}

}}
