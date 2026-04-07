
package equalsOverride;

class Product {
    int pid;
    double price;

    Product(int pid, double price) {
        this.pid = pid;
        this.price = price;
    }

    public boolean equals(Object obj) {
        Product p = (Product) obj;
        return this.pid == p.pid && this.price == p.price;
    }

    public static void main(String[] args) {
        Product p1 = new Product(1, 999.0);
        Product p2 = new Product(1, 999.0);
        System.out.println(p1.equals(p2));
    }
}
