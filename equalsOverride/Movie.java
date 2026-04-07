
package equalsOverride;

class Movie {
    String title;
    int year;

    Movie(String title, int year) {
        this.title = title;
        this.year = year;
    }

    public boolean equals(Object obj) {
        Movie m = (Movie) obj;
        return this.title.equals(m.title) && this.year == m.year;
    }

    public static void main(String[] args) {
        Movie m1 = new Movie("Inception", 2010);
        Movie m2 = new Movie("Inception", 2010);
        System.out.println(m1.equals(m2));
    }
}
