package patterns;

public class UpperTriangle {
	public static void main(String[] args) {
		int n =1;
		for(int i =0;i<=4;i++) {
			for(int j = 0;j<=4;j++) {
				if(i>=j) {
					System.out.print(j+" ");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
