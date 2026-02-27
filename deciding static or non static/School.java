class School
{
static String school_name = "Sun valley public school";
String grade;
int school_strength;

public static void main(String[] args){
	School student1 = new School();
System.out.println("The school name is : "+school_name);
student1.grade = "A+";
student1.school_strength = 600;
System.out.println("The student 1 Grade : "+student1.grade+"\nStrength : "+student1.school_strength);
School student2 = new School();
student2.grade = "A";
student2.school_strength = 601;
System.out.println("The student 2 Grade : "+student2.grade+"\nStrength : "+student2.school_strength);
}
}