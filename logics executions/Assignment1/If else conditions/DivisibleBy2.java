class DivisibleBy2 
{
static void check(int num)
{
	if(num%2==0){
		System.out.println(num+" is divisible by 2");
	}else{
		System.out.println(num+ " is not divisible by 2");
	}
}
	public static void main(String[] args) 
	{
		 for (int i = 1;i<=10 ;i++ )
		 {
			check(i);
		 }
	}
}
