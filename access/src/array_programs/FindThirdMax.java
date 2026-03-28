package array_programs;

import java.util.Arrays;

public class FindThirdMax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {20,27, 13, 12 , 26, 38, 41};
		int fmax =-1, smax=-2, tmax =-3;
		
		for(int i =0;i<a.length;i++) {
			if(fmax<a[i] ){
				tmax = smax;
				smax = fmax;
				fmax = a[i];
			}
			else if(smax<a[i] && a[i]!=fmax) {
				tmax = smax;
				smax = a[i];
			}
			else if(tmax<a[i]) {
				tmax = a[i];
			}
		}
		System.out.println(Arrays.toString(a));
		System.out.println("fmax : "+fmax+" smax: "+smax+" tmax: "+tmax);
		
	}

}
