class Employee
{
int emp_id;
double emp_sal;
String emp_grade;

Employee(int eid, double sal, String e_grade){
	emp_id = eid;
emp_sal = sal;
emp_grade = e_grade;
}

public static void main(String[] args){
	Employee e = new Employee(28, 100000, "A+");
System.out.println("Employee id : "+e.emp_id+"\n Salary : "+e.emp_sal+"\n Grade : "+e.emp_grade);
}
}