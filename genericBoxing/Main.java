package genericBoxing;
import java.awt.Window.Type;
import java.util.*;
class Employee{
	String ename;
	int eid;
	double sal;
	Employee(String ename, int eid, double sal){
		this.ename = ename;
		this.eid = eid;
		this.sal = sal;
		}
	
	public String toString() {
		return this.ename+" "+this.eid+" "+this.sal;
	}
}
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Employee> l1 = new ArrayList<Employee>();
		l1.add(new Employee("prashanth", 7, 50000.50));
		l1.add(new Employee("ayyaleppa", 28, 50000.50));
		for(int i =0;i<l1.size();i++) {
		Object obj = l1.get(i);
		Employee e1 = (Employee)obj;
		System.out.println(e1);
		System.out.println(l1.getClass().getSimpleName());
		System.out.println(obj.getClass().getSimpleName());
		System.out.println(e1.getClass());

		}
	}

}
