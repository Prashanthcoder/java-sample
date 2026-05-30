package tcsnqt;
import java.util.Arrays;

public class RightShiftZeroes {
	public static void shiftZeroes(int[] arr) {
		int j = 0;
		for(int i =0;i<arr.length;i++) {
			if(arr[i]!=0) {
				arr[j] = arr[i];
				j++;
			}
		}
			while(j<arr.length) {
				arr[j] = 0;
				j++;
			}
		
		System.out.println(Arrays.toString(arr));
	}
	
	public static void shiftZeroesFront(int[] arr) {
		int j = arr.length-1;
		for(int i = arr.length-1;i>=0;i--) {
			if(arr[i]!=0) {
				arr[j] = arr[i];
				j--;
			}
		}
		
		while(j>=0) {
			arr[j] = 0;
			j--;
		}
		
		System.out.println(Arrays.toString(arr));
	}
	
	public static void product(int n) {
		int res = 1;
		while(n!=0) {
			int digit = n%10;
			res = res * digit;
			n/=10;
		}
		System.out.println(res);
	}
	
	public static void convertBinary(int n) {
		String res="";
		while(n!=0) {
			int rem = n%2;
			res = res + rem;
			n=n/2;
		}
		System.out.println(res);
		
//		String rev = "";
//		for(int i =res.length()-1;i>=0;i--) {
//			rev = rev + res.charAt(i);
//		}
//		System.out.println(rev);
		int no = 0;
		for(int i = 0;i<res.length();i++) {
			char ch = res.charAt(i);
			no = (no*2) + (ch-'0');
		}
		System.out.println(no);
	}
	public static void main(String[] args) {
		int[] arr = {4, 5, 0, 1, 9, 0, 5, 0};
		int[] arr1 = {1, 0, 2, 0, 1, 0, 2};
		shiftZeroes(arr);
		shiftZeroesFront(arr1);
		product(5244);
		convertBinary(10);
	}
}
