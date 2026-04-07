
package equalsOverride;

class Student {
    int roll;
    String dept;

    Student(int roll, String dept) {
        this.roll = roll;
        this.dept = dept;
    }

    public boolean equals(Object obj) {
        Student s = (Student) obj;
        return this.roll == s.roll && this.dept.equals(s.dept);
    }

    public static void main(String[] args) {
        Student s1 = new Student(10, "CSE");
        Student s2 = new Student(10, "CSE");
        System.out.println(s1.equals(s2));
    }
}
