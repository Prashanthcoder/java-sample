package array_programs;

import java.util.Arrays;

public class Union {
	static void RemoveAdj(int[] a){
		for(int i =0;i<a.length-1;i++) {
			if(a[i]!=a[i+1]) {
				System.out.print(a[i]+ " ");
			}
		}
		System.out.println(a[a.length-1]);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a1[] = {1, 2, 3, 4, 5, 5,6, 6};
int a2[]  = {2, 3, 7, 8, 9, 9, 11};
int temp[] = new int[a1.length+a2.length];
System.arraycopy(a1, 0, temp, 0, a1.length);
System.arraycopy(a2, 0, temp, a1.length, a2.length);
System.out.println(Arrays.toString(temp));
Arrays.sort(temp);
RemoveAdj(temp);

	}

}
