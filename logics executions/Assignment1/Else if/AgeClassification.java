class  AgeClassification
{
void classify(int age){
	if(age<13){
		System.out.println(age + " years old is a child");
	}
else if(age>=13 && age<=19){
	System.out.println(age+" years old is Teenager");
}
else if(age>=20 && age<=59){
	System.out.println(age+" years old is an Adult");
}
else {
	System.out.println(age+" years old is Senior citizens");
}
}
	public static void main(String[] args) 
	{
		for (int i = 8;i<=80 ;i+=5 )
		{
new AgeClassification().classify(i);
		}
	}
}
