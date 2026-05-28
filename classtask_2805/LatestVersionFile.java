package classtask_2805;

import java.util.Arrays;

public class LatestVersionFile {
	public static int fileV(String[] arr) {
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		int pos = arr.length;
		return pos;
	}
	
	public static int fileV2(String[] arr) {
		if(arr.length==0) {
			return -1;
		}
		int max = Integer.MIN_VALUE;
		for(String str: arr) {
			int n = Integer.parseInt(str.replaceAll("[^0-9]", ""));
			if(n>max) {
				max = n;
			}
		}
		return max;
	}
	public static void main(String[] args) {
		String[] arr = {"file_1", "file_3", "file_2", "file_8"};
		System.out.println(fileV(arr));
		System.out.println(fileV2(arr));
		
	}
}
