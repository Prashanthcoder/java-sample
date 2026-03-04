class Student
{
static void StudentDetails(String name){
	System.out.println("The name of the student "+name);
}
static void StudentDetails(String name, int id){
	System.out.println("The id of the student : "+id+" Name : "+name);
}
static void StudentDetails(int result, String name, int id){
	System.out.println("The id : "+id+" Name : "+name+" Result : "+result);
}

public static void main(String[] args){
	StudentDetails("Prashanth");
StudentDetails("Prashanth", 28);
StudentDetails(99, "Prashanth", 28);
	}
}