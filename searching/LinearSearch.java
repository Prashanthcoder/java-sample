package searching;

public class LinearSearch {
	public static void main(String[] args) {
		int[] a = {2,3, 8, 10, 17, 636, 882};
		int key = 17;
		for(int i = 0;i<a.length;i++) {
			if(key==a[i]) {
				System.out.println(key+ " key found at "+i);
				return;
			}
		}
		System.out.println(key+" Key not found");
	}
}
