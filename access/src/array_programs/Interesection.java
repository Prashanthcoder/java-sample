package array_programs;

public class Interesection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a1 = {1, 2, 3, 3, 4, 4, 5};
		int[] a2 = {2, 3, 4, 5, 6};
		int[] temp = new int[10];
		
		
		for(int i =0;i<a1.length;i++) {
			for(int j = 0;j<a2.length;j++) {
				if(a1[i]==a2[j]) {
					temp[i] = a1[i];
					System.out.print(a1[i]+" ");
				}
			}
		}
		System.out.println();
		Union.RemoveAdj(temp);
	}

}
