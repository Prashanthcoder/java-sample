package classtask_2805;

public class Sum18 {
	public static void sumCheck(int[] arr) {
		int sum =0;
		for(int i =0;i<arr.length;i++) {
			sum = sum + arr[i];
		}
		if(sum==18) {
			System.out.println(sum+ " equal");
			return;
		}
		System.out.println(sum+ " not equal");
	}
	
	public static void sum18(int[] arr) {
		boolean f = false;
		for(int i =0;i<arr.length;i++) {
			for(int j = i+1;j<arr.length;j++) {
				if(arr[i]+arr[j]==18) {
					System.out.println("the values which make the sum 18 is {"+arr[i]+ ", "+arr[j]+"}");
					f = true;
				}
				
			}
		}
		if(!f)
			System.out.println("not found");
	}
	
	public static void main(String[] args) {
		int[] arr = {11, 1, 2, 8, 10, 7, 15, 7};
		int[] arr1 = {11, 3, 4, 0};
		int[] arr2 = {20, 15, 3, 5, -2};
		sumCheck(arr);
		sumCheck(arr1);
		sum18(arr2);
		sum18(arr);
		sum18(arr1);
		
	}
}
