class Armstrong 
{
	public static void main(String[] args) 
	{
		// code to check whether a number is armstrong or not

		int n = 153, count = 0, arms = 0;
		int original = n;
		int temp = n;
		while(temp>0){
			temp=temp/10;
			count++;
		}
		temp = n;
		while(temp>0){
			int digit = temp%10;
			temp/=10;
			arms = arms + (int)Math.pow(digit, count);
		}
System.out.println("the total digits: "+count+" the sum of each digit raised to power of no. of digits  is "+arms);
		if(arms == original){
			System.out.println("it is amstrong number");
		}else{
			System.out.println("it ain't one buddy");
		}
	}
}
