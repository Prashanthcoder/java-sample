class NumClassify 
{
static void check(int num){
	if(num>0){
		System.out.println(num+" is positive ");
	}
else if(num == 0){
	System.out.println(num+" is zero");
}
else if(num<0){
	System.out.println(num+" is negative");
}
}
	public static void main(String[] args) 
	{
		check(-145);
		check(34);
		check(0);
	}
}
