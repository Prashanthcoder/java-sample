package array_programs;

public class ArrangeArray {
	public static void main(String[] args) {
		int[] a = {1, 2, 3, 4 ,5, 6};
		//print 1-6
		System.out.println("Printing 1 - 6");
		for(int i =0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println("\nPrinting 1 - 3");
		for(int i = 0; i<a.length/2;i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println("\nPrinting 4 - 6");
		for(int i = a.length/2; i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println("\nPrinting only even elements from the arrays");
		for(int i = 0;i<a.length;i++) {
			if(a[i]%2==0) {
			System.out.print(a[i]+ " ");
		}
			
        }
		
		System.out.println("\nPrinting only odd elements from the arrays");
		for(int i =0;i<a.length;i++) {
			if(a[i]%2==1) {
				System.out.print(a[i] + " ");
			}
		}
		
		System.out.println("\nPrinting even indices from the arrays");
		for(int i = 0; i<a.length;i++) {
			if(i%2==0)
				System.out.print(a[i]+" ");
		}
		
		System.out.println("\nPrinting odd indices from the arrays");
		for (int i = 0; i < a.length; i++) {
			if (i%2==1) {
				System.out.print(a[i]+ " ");
			}
		}
		int sum =0;
		System.out.println("\nCalculate the sum of each arrays ex(1-6)");
		for (int i = 0; i < a.length; i++) {
			sum = sum + a[i];
		}
		System.out.println(" the sum of the array is "+sum);
		
		int result = 1;
		System.out.println("Calculate the product of each arrays ex(1-6)");
		
		for (int i = 0; i < a.length; i++) {
			result *= a[i];
		}
		System.out.println("the product of the each element : "+result);
		
		int count = 0;
		System.out.println("The count of the arrays");
		for (int i = 0; i < a.length; i++) {
			count++;
		}
		System.out.println("Count : "+count);
		
}
}