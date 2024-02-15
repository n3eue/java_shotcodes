package libforbook;

public class Main {
    public static void main(String[] args) {
        // This part is for testing the created classes
        Bibliotheque myLib = new Bibliotheque();

        // Create five book
        Livre book1 = new Livre("The Hunger Games","Suzanne Collins", 2017);
        Livre book2 = new Livre("Don Quixote","Miguel de Cervantes", 1984);
        Livre book3 = new Livre("Treasure Island","Robert Louis Stevenson", 2001);
        Livre book4 = new Livre("The Pilgrim's Progress","John Bunyan", 2006);
        Livre book5 = new Livre("Kim","Rudyard Kipling", 2017);

        // Show details of one book
        System.out.println("\nGetting details of a book\n");
        book1.ShowDetails();

        // Add a book in the Bibliotheque
        myLib.AddBook(book1);
        myLib.AddBook(book2);
        myLib.AddBook(book3);
        myLib.AddBook(book4);
        myLib.AddBook(book5);

        // Show the book in the Bibliotheque
        myLib.ShowBooks();

        // Search a book based on the author
        // Case 1: Non-existing author
        String oneAuthor = "Albert Camus";
        myLib.SearchBooksFromAuthor(oneAuthor);

        // Case 2: Existing author
        oneAuthor = "Suzanne Collins";
        myLib.SearchBooksFromAuthor(oneAuthor);

        // Check of others methods for errors handling
        String oneBook = "To Have and Have Not";
        myLib.searchBookFromTitle(oneBook);

        int oneYear = 2014;
        myLib.searchBookFromYear(oneYear);

        myLib.searchBookFromYear(2017);

    }
}