class ResultMarks 
{
static void result(int marks){
	if(marks<35){
		System.out.println(marks+ "  marks Exam Failed  ");
	}
else{
	System.out.println(marks + " marks Exam passed! ");
}
}
	public static void main(String[] args) 
	{
		result(34);
result(35);
result(12);

	}
}
