class  PosEven
{
static void check(int n){
	if(n>0){
		System.out.println(n+" is a positive number");
			if(n%2==0){
				System.out.println(n+" is positive and even number");
			}
	}
}
	public static void main(String[] args) 
	{
		for(int i=-20;i<=20;i++)
		check(i);
	}
}
