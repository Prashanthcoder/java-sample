package classtask_2805;

public class SumOfPrimeRange {
	public static void main(String[] args) {
		int range = 50;
		int sum =0;
		for(int i = 2;i<=range;i++) {
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
			}
		}
		System.out.println(sum);
	}
}
