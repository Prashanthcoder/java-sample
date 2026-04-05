package problemsqspider;

public class Facto {
static void fact(int num) {
	int fact = 1;
	for(int i = 1;i<=num;i++) {
		fact = fact*i;
	}
	System.out.println("the factorial of the number "+num+" is "+fact);
}
}
