public class Book {
    private final String bookTitle;
    private final Author author;
    private int yearOfPublication;

    public Book (String bookTitle, Author author, int yearOfPublication) {
        this.bookTitle = bookTitle;
        this.author = author;
        this.yearOfPublication = yearOfPublication;
    }
    public String getBookTitle () {
        return this.bookTitle;
    }
    public Author getAuthor () {
        return this.author;
    }

    public int getYearOfPublication () {
        return this.yearOfPublication;
    }
    public void setYearOfPublication (int yearOfPublication) {
        this.yearOfPublication = yearOfPublication;
    }
}