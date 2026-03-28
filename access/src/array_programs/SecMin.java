package array_programs;

public class SecMin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
				// TODO Auto-generated method stub
				int a[] = {12, 113, 0, 32, 20};
				int min = Integer.MAX_VALUE, smin = Integer.MAX_VALUE;
				for(int i =0;i<a.length;i++) {
					if(min>a[i]) {
						smin = min;
						min=a[i];
					}
					else if(smin>a[i] && a[i]!=min) {
						smin = a[i];
					}
				}
				System.out.println("First minumum is : " +min+ " and Second minumum is "+smin);
			}

		}

	
