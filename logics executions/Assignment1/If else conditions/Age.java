class Age 
{
static void AgeClassification(int age){
	if(age<18){
		System.out.println("This person is minor since he/she is "+age+" years old");
	}else{
		System.out.println("This person is adult since he/she is "+age+" years old");
	}
}
	public static void main(String[] args) 
	{
		for (int i = 12;i<=28 ;i++ )
		{
			AgeClassification(i);
		}
	}
}
