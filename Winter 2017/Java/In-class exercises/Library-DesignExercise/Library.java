import java.util.*;

public class Library {
    ArrayList<Book> libraryContents;
    
    public Library() {
        libraryContents = new ArrayList();
    }
    
    public void addBook(String title, String author, int id) {
        Book newBook = new Book(title,author,id);
        
        libraryContents.add(newBook);
    }
    
    public void removeBook(String title) {
        for(int i = 0 ; i < libraryContents.size() ; i = i + 1) {
            if(libraryContents.get(i).getTitle().equals(title)) {
                libraryContents.remove(i);
            }
        }
    }
    
    public int librarySize() {
        return libraryContents.size();
    }
    
    public void bookList() {
        for(int i = 0 ; i < libraryContents.size() ; i = i + 1) {
            System.out.println(libraryContents.get(i));
        }
    }
}
