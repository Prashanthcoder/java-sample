class EqualCheck 
{
static void test(int num1, int num2){
	if(num1 == num2){
		System.out.println("Yes! the numbers are equal " + num1 + " and "+num2);
	}
}
	public static void main(String[] args) 
	{
		test(3, 3);
		test(453, 453);
		test(34, 324);
	}
}
