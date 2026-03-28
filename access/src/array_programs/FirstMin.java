package array_programs;

public class FirstMin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {12, 113, 0, 32, 20};
		int min = a[0];
		for(int i =0;i<a.length;i++) {
			if(min>a[i]) {
				min=a[i];
			}
		}
		System.out.println("First minumum is : " +min);
	}

}
