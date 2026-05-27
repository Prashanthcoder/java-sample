package practice27_05;

public class Factorial {
	static int fact(int n) {
		if(n==0 || n==1)
		return 1;
		else {
			return n* fact(n-1);
		}
	}
	
	static int factLoop(int n) {
		int fact =1;
		if(n<=1) {
			return 1;
		}
		for(int i =n;i>=1;i--) {
			if(i>1) {
			System.out.print(i+"x");
			}else {
				System.out.println(i);
			}
			fact = fact*i;
		}
		return fact;
	}
 public static void main(String[] args) {
	 int result = fact(10);
	 System.out.println(result+ " is the factorial using recursion");
	  result = factLoop((int)31.152);
	  System.out.println(result+" is the factorial using loops");
 }
}
