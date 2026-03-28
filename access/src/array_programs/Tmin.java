package array_programs;

public class Tmin {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			
					// TODO Auto-generated method stub
					int a[] = {12, 113, 0, 32, 20};
					int min = Integer.MAX_VALUE, smin = Integer.MAX_VALUE, tmax = Integer.MAX_VALUE;
					for(int i =0;i<a.length;i++) {
						if(min>a[i]) {
							tmax = smin;
							smin = min;
							min=a[i];
						}
						else if(smin>a[i] && a[i]!=min) {
							tmax = smin;
							smin = a[i];
						}else if(tmax>a[i]) {
							tmax = a[i];
						}
					}
					System.out.println("First minumum is  " +min+ " and Second minumum is "+smin+ " third minumum "+tmax);
				}
}
