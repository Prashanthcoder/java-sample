class CheckDigits 
{
static void test(int num){
	if(num>99 && num<1000){
		System.out.println(num + " is having 3 digits");		
	}
}
	public static void main(String[] args) 
	{
		for(int i = 98; i<=999; i+=17){
			test(i);
		}
	}
}
