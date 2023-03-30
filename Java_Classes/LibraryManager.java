package Java_Classes;

/**
 * @author GauravSP
 * @since 2003
 * @version 0.01
 */
class Library1 {

    String[] booksAvailable;
    int noOfBooks ;

    Library1() {
        this.booksAvailable = new String[100];
        this.noOfBooks = 0;
    }

    void addBook(String book) {
        this.booksAvailable[noOfBooks] = book;
        noOfBooks++;
        System.out.println("Thank you for adding this book" + book);
    }

    void showAvailableBooks() {
        System.out.println("Here total " + noOfBooks + "  books are available");
        for (String book : this.booksAvailable) {
            if (book == null) {
                continue;
            }
            System.out.println("*" + book);
        }
    }
    void issueBook(String book){
        for (int i = 0; i < this.booksAvailable.length; i++) {
            if (this.booksAvailable[i].equals(book)) {
                System.out.println("Your book is issued which is  " + book);
                noOfBooks--;
                this.booksAvailable[i] = null;
                return;
            }
        }
        System.out.println("This book not isuue");
    }


    void returnBook(String book) {
        addBook(book);
        System.out.println("You have successfully returned " + book + "book");

    }
}
public class LibraryManager {
    public static void main(String[] args) {
        Library1 Gaurav= new Library1();
        Gaurav.addBook("HC verma");
        Gaurav.addBook("DC pandey" );
        Gaurav.addBook("Mtg of biology");
        Gaurav.showAvailableBooks();
        Gaurav.issueBook("HC verma");
        Gaurav.showAvailableBooks();



    }
}
