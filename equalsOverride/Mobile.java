
package equalsOverride;

class Mobile {
    String brand;
    int ram;

    Mobile(String brand, int ram) {
        this.brand = brand;
        this.ram = ram;
    }

    public boolean equals(Object obj) {
        Mobile m = (Mobile) obj;
        return this.brand.equals(m.brand) && this.ram == m.ram;
    }

    public static void main(String[] args) {
        Mobile m1 = new Mobile("Samsung", 8);
        Mobile m2 = new Mobile("Samsung", 8);
        System.out.println(m1.equals(m2));
    }
}
