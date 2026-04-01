package assignment;

public class Main2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {1, 2, 3, 4, 5, 6, 7, 8};
		int max = Integer.MIN_VALUE;
		for(int i =0;i<a.length;i++) {
			int n = a[i]; boolean f = true;
			if(n<=1) {
				f = false;
			}else {
				for(int j =2;j*j<=n;j++) {
					if(a[j]%j==0) {
						f = false;
					}
				}
				
			}
			if(f) {
				if(max<a[i]) {
					max = a[i];
					System.out.print(max+ " ");
				}
			}
			
		}
	}

}
