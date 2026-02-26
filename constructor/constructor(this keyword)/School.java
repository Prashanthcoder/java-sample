class School
{
String school_name;
String school_grade;
int school_strength;

School(String school_name, String school_grade, int school_strength){
	this.school_name = school_name;
this.school_grade = school_grade;
this.school_strength = school_strength;
}

public static void main(String[] args){
	School s = new School("sun valley public school", "A+", 600);
System.out.println("School : "+s.school_name+"\nGrade : "+s.school_grade+"\nStrength : "+s.school_strength);
}
}