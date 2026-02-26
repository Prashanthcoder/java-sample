class Course
{
String course_name;
String university_name;
int exam_cost;

Course(String course_name, String university_name, int exam_cost){
	this.course_name = course_name;
this.university_name = university_name;
this.exam_cost = exam_cost;

}

public static void main(String[] args){
	Course c = new Course("cse", "vtu", 1680);
System.out.println("Course Name : "+c.course_name+"\nUniversity Name : "+c.university_name+"\nExam cost : "+c.exam_cost);
}
}