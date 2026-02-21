class Marks 
{
static void markscheck(int marks){
	if(marks>90){
		System.out.println(marks+" is above excellent marks");
	}
}
	public static void main(String[] args) 
	{
		for(int i=50; i<=100; i++)
		markscheck(i);
	}
}
