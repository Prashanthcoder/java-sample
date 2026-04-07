
package equalsOverride;

class Laptop {
    String brand;
    double price;

    Laptop(String brand, double price) {
        this.brand = brand;
        this.price = price;
    }

    public boolean equals(Object obj) {
        Laptop l = (Laptop) obj;
        return this.brand.equals(l.brand) && this.price == l.price;
    }

    public static void main(String[] args) {
        Laptop l1 = new Laptop("Dell", 75000);
        Laptop l2 = new Laptop("Dell", 75000);
        System.out.println(l1.equals(l2));
    }
}
