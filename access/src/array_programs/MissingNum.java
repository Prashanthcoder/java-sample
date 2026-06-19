package access.src.array_programs;

public class MissingNum {
	
	public static void findNum(int arr[]) {
		int n = arr.length+1;
		int total = n*(n+1)/2, sum = 0;
		for(int i = 0;i<arr.length;i++) {
			sum += arr[i];
		}
		System.out.println("the missing number is : "+(total-sum));
	}
	public static void main(String[] args) {
		int[] arr = {1, 5, 8, 2, 3, 4, 6, 7};
		findNum(arr);
	}
}
