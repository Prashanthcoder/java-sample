class  FactorialStrong
{
	static int fact(int num){
		int facto = 1;
		for(int i=1;i<=num;i++){
			facto = facto*i;
		}
		return facto;
}
	public static void main(String[] args) 
	{
		int num = 153, temp = num, original = num, digits = 0, sum=0;
		while(temp>0){
			temp/=10;
			digits++;
		}
		temp = num;
		while(temp>0){
			int digit = temp%10;
			temp/=10;
			sum = sum+ fact(digit);
		}
int a = 2, b= 3;
while(b!=0){
	int carry= (a&b)<<1;
	a = a^b;
	b = carry;
}
System.out.println(a+" "+sum);
		System.out.println("the sum of factorial of each digit : "+sum+" digits : "+digits);
System.out.println(sum==original?"it is strong num":"it is not strong number");
	}
}
