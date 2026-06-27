package sorting;

import java.util.Arrays;

public class Quicksort {
	public int getPivot(int a[], int li, int hi) {
		int pivot = hi;
		int j = li-1;
		for(int i = li;i<=hi;i++) {
			if(a[i]<=a[pivot]) {
				j++;
				int temp = a[i];
				a[i] = a[j];
				a[j] = temp;
			}
		}
		return j;
	}
	
	public void quickSort(int a[], int li, int hi) {
		if(li<=hi) {
			int pivot = getPivot(a, li, hi);
			quickSort(a, li, pivot-1);
			quickSort(a, pivot+1, hi);
		}
	}
	
	public static void main(String[] args) {
		Quicksort qs = new Quicksort();
		int a[] = {3, 12, 34, 89, 1888};
		qs.quickSort(a ,0, a.length-1);
		System.out.println(Arrays.toString(a));
	}
	
}
