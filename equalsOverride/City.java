
package equalsOverride;

class City {
    String name;
    int population;

    City(String name, int population) {
        this.name = name;
        this.population = population;
    }

    public boolean equals(Object obj) {
        City c = (City) obj;
        return this.name.equals(c.name) && this.population == c.population;
    }

    public static void main(String[] args) {
        City c1 = new City("Mumbai", 20000000);
        City c2 = new City("Mumbai", 20000000);
        System.out.println(c1.equals(c2));
    }
}
