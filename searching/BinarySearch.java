package searching;

import java.util.Arrays;

public class BinarySearch {
public static void main(String[] args) {
	int[] a = {2, 8, 1, 12, 82, 7, 16};
	Arrays.sort(a);//1, 2, 7, 8, 12, 16, 82
	int key = 16;
	int low = 0;
	int high = a.length-1;
	while(low<=high) {
		int mid = (low+high)/2;
		if(a[mid]==key) {
			System.out.println(key+" key found at "+mid);
			return;
		}else if(a[mid]<key) {
			low = mid+1;
		}else {
			high = mid-1;
		}
	}
	System.out.println("not found");
}
}
