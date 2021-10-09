package Section16_ReactiveProgramming.Section116_Observer;

public class App {
    public static void main(String[] args) {

        Book book = new Book("Goosebumps", "Horror", "Xyz", 200, "Sold Out");

        EndUser user1 = new EndUser("Bob", book);
        EndUser user2 = new EndUser("Rob", book);
        EndUser user3 = new EndUser("Pete", book);

        System.out.println(book.getInStock());
        book.setInStock("In Stock");

    }
}
