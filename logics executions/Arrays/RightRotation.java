package array_programs;

import java.util.Arrays;

public class RightRotation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1, 2, 3, 4, 5};
		int k = 2;
		k = k%arr.length;
		for(int i = 0;i<k;i++) {
			int last = arr[arr.length-1];
			for(int j = arr.length-1;j>0;j--) {
				arr[j] = arr[j-1];
			}
			arr[0]= last;
		}
		System.out.println(Arrays.toString(arr));
	}

}
