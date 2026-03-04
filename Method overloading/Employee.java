class Employee
{
static void EDetails(String name){
	System.out.println("Name of the employee : "+name);
}
static void EDetails(String name, double salary){
	System.out.println("Name : "+name+"\nSalary : "+salary);
}
static void EDetails(String hiredate, int deptno, int eid){
	System.out.println("Hired on : "+hiredate+" Deptno: "+deptno+" Employee : "+eid);
}
public static void main(String[] args){
	EDetails("Saar");
EDetails("Saar", 1111900.34);
EDetails("10-05-2026", 10, 702349);
}
}





















