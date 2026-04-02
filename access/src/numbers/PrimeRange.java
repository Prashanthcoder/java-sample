package numbers;
import java.util.*;
public class PrimeRange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc  = new Scanner(System.in);
		int range = sc.nextInt();
		int n =1; 
		for(int j = n;j<=range;j++) {
		boolean f = true;
		n = j;
		if(n<=1) {
			f = false;
		}
		else {
			for(int i =2;i*i<=n;i++) {
				if(n%i==0) {
					f = false;
					break;
				}
			}
		}
		if(f) {
			System.out.print(n+ " ");
		}
		
	}

}}
