//program to check whether the year is century or not
class Century 
{
static void check(int year){
	if(year%100==0){
		System.out.println(year + " is a century ");
	}else{
		System.out.println(year + " is not a century");
	}
}
	public static void main(String[] args) 
	{
		for (int i= 100;i<=1300 ;i+=100 )
		{
			check(i);

		}
check(485);
	}
}
