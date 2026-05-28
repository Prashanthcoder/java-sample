package classtask_2805;
import java.util.Scanner;
public class SumOfPrimeRange {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("number of prime to add ");
		int n = sc.nextInt();
		int sum =0, count = 0;
		int i = 2;
		while(count<n) {
//		for(int i = 2;i<=1000;i++) {
			boolean f = true;
			for(int j = 2;j*j<=i;j++) {
				if(i%j==0) {
					f = false;
					break;
				}
			}
			if(f) {
				System.out.print(i+" ");
				sum= sum+i;
				count++;
			}
			i++;
		}
//		}
		System.out.println("\nthe sum of these above numbers are: "+sum);
	}
}
