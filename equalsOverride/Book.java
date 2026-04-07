
package equalsOverride;

class Book {
    int id;
    String title;

    Book(int id, String title) {
        this.id = id;
        this.title = title;
    }

    public boolean equals(Object obj) {
        Book b = (Book) obj;
        return this.id == b.id && this.title.equals(b.title);
    }

    public static void main(String[] args) {
        Book b1 = new Book(101, "Java");
        Book b2 = new Book(101, "Java");
        System.out.println(b1.equals(b2));
    }
}
