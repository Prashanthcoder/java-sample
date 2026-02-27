class Employee
{
static int emp_id= 204;
double sal;
String grade;


public static void main(String[] args){
	Employee e1 = new Employee();
System.out.println("the employee id "+emp_id);
e1.sal = 200000.50;
e1.grade = "A+";
System.out.println("The employee salary : "+e1.sal+"\nThe employee grade : "+e1.grade);
Employee e2 = new Employee();
e2.sal = 300000.50;
e2.grade = "A+";
System.out.println("The employee salary : "+e2.sal+"\nThe employee grade : "+e2.grade);
}
}