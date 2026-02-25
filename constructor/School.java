class School
{
String school_name;
String school_grade;
int school_strenth;

School(String sn, String sg, int ss){
	school_name = sn;
school_grade = sg;
school_strenth = ss;
}

public static void main(String[] args){
	School sc = new School("Sun valley public school", "A+", 600);
	System.out.println("School : "+sc.school_name+"\n Grade : "+sc.school_grade+"\n Strength : "+sc.school_strenth);
}
}