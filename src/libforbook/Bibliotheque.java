package libforbook;
import java.util.ArrayList;


public class Bibliotheque {
    private ArrayList<Livre> bookList;

    // Constructor
    public Bibliotheque(){
        this.bookList = new ArrayList<>();
    }


    // A method for adding a book to the library
    public void AddBook(Livre myBook){
        this.bookList.add(myBook);
    }

    public void ShowBooks(){
        if(this.bookList.isEmpty()){
            System.out.println("Empty library x_x");
        }

        System.out.println("\nWelcome to the bibilotheque. \nHere are the books available.");
        int it = 0;

        for(Livre book: this.bookList){
            it++;
            System.out.println("------- " + it + " -------");
            book.ShowDetails();
            System.out.println("\n");
        }
    }

    // Find a book based on the author name
    public void SearchBooksFromAuthor(String authorName){
        boolean isFound = false;
        String nameOnLowerCase = authorName.toLowerCase();
        for(Livre book: this.bookList){
            if(nameOnLowerCase.equals(book.getAuthor().toLowerCase())){
                book.ShowDetails();
                isFound = true;
            }

        }
        if (!isFound){
            System.out.println("No books found for the author *" + authorName + "* in our library\n");
        }

    }

    // Errors handling (book not found or not existing)
    public void searchBookFromTitle(String title){
        boolean isFound = false;
        String titleInLow = title.toLowerCase();
        System.out.println("\nResults of the search:");
        for(Livre book: this.bookList){
            if ((titleInLow.equals(book.getTitle()))){
                System.out.println(">" + book.getTitle() +"\n");
                isFound = true;
            }
        }
        if (!isFound){
            System.out.println("\nNo books found for the title *" + title + "* in our library");
        }
    }

    public void searchBookFromYear(int year){
        boolean isFound = false;
        System.out.println("\nResults of the search:");
        for(Livre book: this.bookList){
            if (year==book.getPublicationYear()){
                System.out.println("> " + book.getTitle() + " published in " + book.getPublicationYear());
                isFound = true;
            }
        }
        if (!isFound){
            System.out.println("\nNo books published in this year is available in our library");
        }
    }

}
