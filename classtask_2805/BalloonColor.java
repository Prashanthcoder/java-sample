package classtask_2805;

import java.util.Scanner;

public class BalloonColor {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		char[] balloons = new char[n];
		boolean found_odd = false;
		for(int i =0;i<n;i++) {
		balloons[i] = sc.next().charAt(0);
	}
		int[] arr = new int[128];
		for(char ch: balloons) {
			arr[ch]++;
		}
		
		for(int i =0;i<arr.length;i++) {
			if(arr[i]!=0) {
				if(arr[i]%2!=0) {
					System.out.println((char)i);
					found_odd= true;
					}
				
			}
		}
		if(!found_odd) {
			System.out.println("All are even");
		}
		}
	
}
