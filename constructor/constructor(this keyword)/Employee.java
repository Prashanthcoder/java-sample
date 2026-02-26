class Employee
{
int emp_id;
double emp_sal;
String emp_grade;

Employee(int emp_id, double emp_sal, String emp_grade){
	this.emp_id = emp_id;
this.emp_sal = emp_sal;
this.emp_grade = emp_grade;
}

public static void main(String[] args){
Employee e = new Employee(28, 100000.60, "A+");
System.out.println("Id : "+e.emp_id+"\nSalary : "+e.emp_sal+"\nGrade : "+e.emp_grade);
}
}