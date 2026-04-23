package array_programs;

import java.util.Arrays;

public class LeftRotation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {5, 3, 2, 4, 1};
		int k = 4;
		k = k%arr.length;
		for(int i = 0;i<k;i++) {
			int first = arr[0];
			for(int j = 0;j<arr.length-1;j++) {
				arr[j] = arr[j+1];
			}
			arr[arr.length-1]=first;
		}
		
		System.out.println(Arrays.toString(arr));
		
	}

	

}
