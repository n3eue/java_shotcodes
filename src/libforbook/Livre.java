package libforbook;

public class Livre {
    private String title;
    private String author;
    private int publicationYear;

    // Constructor
    public Livre(String title, String author, int year){
        this.title = title;
        this.author = author;
        this.publicationYear = year;
    }

    // Getters

    // Get the title of a book
    public String getTitle(){
        return this.title;
    }

    // Get the author of a book
    public String getAuthor(){
        return this.author;
    }

    // Get the publication year of a book
    public int getPublicationYear(){
        return this.publicationYear;
    }

    // A method for showing details about a book
    public void ShowDetails(){
        System.out.println("Book informations: ");
        System.out.println("Title: " + this.getTitle());
        System.out.println("Author: " + this.getAuthor());
        System.out.println("Published on: " + this.getPublicationYear());
    }

}


