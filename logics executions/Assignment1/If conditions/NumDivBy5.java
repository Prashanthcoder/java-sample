class NumDivBy5 
{
static void Divisibility(int num){
	if(num%5==0){
		System.out.println(num+" is divisible by 5");
	}
}
	public static void main(String[] args) 
	{
		Divisibility(25);
		Divisibility(55);
		Divisibility(20);
		Divisibility(8);
	}
}
