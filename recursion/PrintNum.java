package recursion;

public class PrintNum {
	public static void print(int n) {
		if(n>=1) {
			System.out.print(n+" ");
			print(n-1);
			
		}
	}
	
	public static void print1ton(int n) {
		if(n>0) {
			
			print1ton(n-1);
			System.out.print(n+" ");
		}
	}
	public static void checkStack(int n) {
	    if (n > 0) {
	        // ZONE A: Executes on the way DOWN (Pushing)
	        System.out.print("Pushing " + n + "\n"); 

	        checkStack(n - 1); // <--- THE DIVIDING LINE

	        // ZONE B: Executes on the way UP (Popping)
	        System.out.print("Popping " + n + "\n"); 
	    }
	}

	public static int sum(int n) {
		if(n==0)return 0;
		return n+sum(n-1);
	}
	
	public static int fact(int n) {
		if(n==1)return 1;
		return n*fact(n-1);
	}
	
	public static void main(String[] args) {
		System.out.println(sum(5));
		System.out.println(fact(5));
		print(10);
		System.out.println();
		print1ton(5);
		checkStack(4);
	}
}
