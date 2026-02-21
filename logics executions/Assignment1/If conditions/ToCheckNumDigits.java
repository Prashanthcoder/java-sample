class ToCheckNumDigits 
{
static int checkout(int num){
int count = 0;
	if(num<0)
return 1;

while(num>0){
	num = num/10;
	count++;
}
return count;
}
	public static void main(String[] args) 
	{
		int num = 3423439;
		System.out.println("The "+num+" has "+checkout(num)+" digits");
		System.out.println("The "+994576+" has "+checkout(994576)+" digits");
	
	}
}
