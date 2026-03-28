package array_programs;
import java.util.*;
public class FindSecMax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the no. of elements and their values to get max of them: ");
		int n = sc.nextInt();
		int a[] = new int[n];
		for(int i = 0;i<a.length;i++) {
			a[i]= sc.nextInt();
		}
		int fmax = -1, smax= -2;
		
		for(int i =0;i<a.length;i++) {
			if(fmax<a[i]) {
				smax= fmax;
				fmax= a[i];
			}
			else if(smax<a[i] && a[i]!=fmax) {
				smax = a[i];
			}
		}
		
		System.out.println("the fmax and smax for array : \n"+Arrays.toString(a)+" is "+fmax+" and "+smax);
		sc.close();
	}

}
