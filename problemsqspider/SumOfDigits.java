package problemsqspider;

public class SumOfDigits {
static void add(int num) {
	int sum=0;
	for(int i =1;i<=num;i++) {
		sum = sum +i;
	}
	System.out.println("The sum from 1 to "+num+" is "+sum);
}
}
