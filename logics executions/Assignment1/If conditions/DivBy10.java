class DivBy10 
{
static void divisible(int num){
	if(num%10==0){
		System.out.println(num+" is divisible by 10");
	}
}
	public static void main(String[] args) 
	{
		divisible(384);
		divisible(190);
		divisible(23840);
	}
}
