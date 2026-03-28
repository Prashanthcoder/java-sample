package array_programs;

import java.util.Arrays;

public class FindFirstMax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {2, 4, 1, 3, 5};
		int fmax = a[0];
		for(int i = 0;i<a.length;i++) {
			if(fmax<a[i]) {
				fmax = a[i];
			}
		}
		
		System.out.println("the first maximum number among : "+Arrays.toString(a)+ " is "+fmax);

	}

}
