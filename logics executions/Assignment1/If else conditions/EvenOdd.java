class EvenOdd 
{
static void check(int num){
	if(num%2==0){
		System.out.println(num+" is an even number");
	}
else{
	System.out.println(num+" is an odd number");
}
}
	public static void main(String[] args) 
	{
		for (int i=0;i<=30;i++ )
		{
		check(i);
		}
	}
}
