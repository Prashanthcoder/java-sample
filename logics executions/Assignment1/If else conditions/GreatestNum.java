class GreatestNum 
{
static void checknum(int num1, int num2){
	if(num1>num2){
		System.out.println(num1+ " is greater ");
	}
else{
	System.out.println(num2 + " is greater ");
}
}
	public static void main(String[] args) 
	{
		checknum(343, 934);
		checknum(393094, 93434);
	}
}
