
package equalsOverride;

class Car {
    String model;
    int year;

    Car(String model, int year) {
        this.model = model;
        this.year = year;
    }

    public boolean equals(Object obj) {
        Car c = (Car) obj;
        return this.model.equals(c.model) && this.year == c.year;
    }

    public static void main(String[] args) {
        Car c1 = new Car("BMW", 2022);
        Car c2 = new Car("BMW", 2022);
        System.out.println(c1.equals(c2));
    }
}
