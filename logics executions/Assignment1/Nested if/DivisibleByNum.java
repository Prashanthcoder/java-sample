class DivisibleByNum 
{
static void checkDiv(int num){
	if(num%2==0){
		System.out.println(num+" is divisible by 2");
			if(num%4==0){
				System.out.println(num+" is divisible by 4");
			}else{
				System.out.println(num+" is not divisible by 4");
			}
	}else{
		System.out.println(num+" is not divisible by 2");
	}
}
	public static void main(String[] args) 
	{
			for(int i= 8;i<=83;i++){
				checkDiv(i);
			}
	}
}
