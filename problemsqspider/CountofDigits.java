package problemsqspider;

public class CountofDigits {
static void CountNum(int num) {
	int count =0;
	if(num==0) {
		count++;
	}
	if(num<0) {
		num*=-1;
	}
	while(num>0) {
		num/=10;
		count++;
		
	}
	System.out.println("the number of digits in it is "+count);
}
}
