class PosorNeg 
{
static void checkNum(int num){
	if(num<0){
		System.out.println(num+" is negative number");
	}
	else if(num == 0){
		System.out.println(num+" is neither positive nor negative");
	}else{
		System.out.println(num+ " is positive number");
	}
}
	public static void main(String[] args) 
	{
		for (int i=-5;i<=5 ;i++ )
		{
			checkNum(i);
		}
	}
}
