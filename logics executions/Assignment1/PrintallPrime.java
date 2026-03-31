package numbers;

public class PrintallPrime {
	
	static void check(int n) {
		boolean f = true;
		if(n<=1) {
			 f = false;
		}
		for(int i =2 ;i*i<=n;i++) {
			if(n%i==0) {
				f = false;
			}
		}
		if(f) {
			System.out.print(n+" ");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {1, 3, 2, 6, 4, 5, 8, 11};
		for(int i = 0;i<a.length;i++) {
			check(a[i]);
		}
	}

}
