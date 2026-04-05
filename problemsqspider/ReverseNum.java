package problemsqspider;

public class ReverseNum {
static void rev(int num) {
	int rev=0;
	while(num>0) {
		rev = rev * 10 + num%10;
		num/=10;
	}
	System.out.println("the number after reversing is "+ rev);
}
}
