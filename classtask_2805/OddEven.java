package classtask_2805;

public class OddEven {
	public static boolean oddOrEvenCheck(int n) {
		if(n%2==0) {
			return true;
		}else {
			return false;
		}
	}
	
	public static void main(String[] args) {
		int[] arr = {2, 3, 4, 8, 3, 10};
		for(int a: arr) {
		if(oddOrEvenCheck(a)) {
			System.out.print("Even ");
		}else {
			System.out.print("Odd ");
		}
	}
	}
}
