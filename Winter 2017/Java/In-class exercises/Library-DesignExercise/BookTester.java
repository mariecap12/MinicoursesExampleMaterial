public class BookTester {
    
    public static void main(String[] args) {
        Book testBook = new Book("1984", "George Orwell", 1);

        System.out.println(testBook);

        System.out.println(testBook.getTitle());

        System.out.println(testBook.getAuthor());

        System.out.println(testBook.getID());
    }
}
