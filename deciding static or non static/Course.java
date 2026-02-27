class Course
{
static String university_name = "vtu";
String course_name;
int exam_cost;

public static void main(String[] args){
	Course c1 = new Course();
System.out.println("The university is "+university_name);
c1.course_name = "cse";
c1.exam_cost = 1680;
System.out.println("The course name is "+c1.course_name+"\nExam cost : "+c1.exam_cost);
Course c2 = new Course();
c2.course_name = "ece";
c2.exam_cost = 2200;
System.out.println("The course name is "+c2.course_name+"\nExam cost : "+c2.exam_cost);
}
}