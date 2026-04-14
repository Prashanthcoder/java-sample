package genericBoxing;
import java.util.ArrayList;
class Student{
	String sname;
	int id;
	String grade;
	Student(String sname, int id, String grade){
		this.sname = sname;
		this.id = id;
		this.grade = grade;
	}
	
	public String toString() {
		return this.sname+ " "+this.id+" "+this.grade;
	}
	
}
public class Main1 {

	public static void main(String[] args) {
		ArrayList a1 = new ArrayList();
		System.out.println(a1.getClass().getSimpleName());
		// TODO Auto-generated method stub
		ArrayList<Student> s1 = new ArrayList<Student>();
		s1.add(new Student("prashanth", 8, "A+"));//Object obj = new Student();
		for(int i =0;i<s1.size();i++) {
			Object obj = s1.get(i);
			Student s2 = (Student)obj;
			System.out.println(s2);
		}
	}

}
