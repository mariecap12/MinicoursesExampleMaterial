public class LibraryTester {
    public static void main(String[] args) {
        Library myLibrary = new Library();
        
        myLibrary.addBook("1984","George Orwell",1);
        myLibrary.addBook("A brave new world","Adoux Huxley",2);
        
        myLibrary.bookList();
        
        System.out.println("There are " + myLibrary.librarySize() + " books in my library.");
        
        myLibrary.removeBook("1984");
        
        myLibrary.bookList();
        
        System.out.println("There are " + myLibrary.librarySize() + " books in my library.");
        
    }
}
