
package equalsOverride;

class Employee {
    int id;
    String name;

    Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public boolean equals(Object obj) {
        Employee e = (Employee) obj;
        return this.id == e.id && this.name.equals(e.name);
    }

    public static void main(String[] args) {
        Employee e1 = new Employee(1, "Rahul");
        Employee e2 = new Employee(1, "Rahul");
        System.out.println(e1.equals(e2));
    }
}
