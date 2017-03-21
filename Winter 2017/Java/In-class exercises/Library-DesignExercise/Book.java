public class Book {
    
    private String bookTitle;   
    private String bookAuthor;
    private int idNumber;
    
    
    public Book(String title, String author, int identificationNumber) {
        bookTitle = title;
        bookAuthor = author;
        idNumber = identificationNumber;
    }
    
    public String toString() {
        return "Title: " + bookTitle + " Author: " + bookAuthor + " ID: " + idNumber;
    }
    
    public String getTitle() { return bookTitle; }
    public String getAuthor() { return bookAuthor; }
    public int getID() { return idNumber; }
    
}
