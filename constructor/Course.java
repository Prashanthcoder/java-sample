class Course
{
String course_name;
String university_name;
int exam_cost;

Course(String cn, String un, int ec){
	course_name = cn;
university_name = un;
exam_cost = ec;
}

public static void main(String[] args){
Course c = new Course("computer science", "vtu", 1680);
System.out.println("Course name : "+c.course_name+"\nUniversity : "+c.university_name+"\nexam_cost : "+c.exam_cost);

}}