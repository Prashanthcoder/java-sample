class ResultCheck 
{
static void result(int marks){
	if(marks>=35){
		System.out.println("Student passed the exam with "+marks+" ");
				if(marks>=85){
					System.out.println("And got Distinction");
				}
				else if(marks<85 && marks>=50){
					System.out.println("And got First Class");
				}
				else{
					System.out.println("And with just Pass marks");
				}
	}
}
	public static void main(String[] args) 
	{
			for(int i=20; i<=100; i+=7){
				result(i);
			}
	}
}
