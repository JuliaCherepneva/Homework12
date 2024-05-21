public class Book {
    private String bookTitle;
    private String author;
    private int yearOfPublication;

    public Book (String bookTitle, String author, int yearOfPublication) {
        this.bookTitle = bookTitle;
        this.author = author;
        this.yearOfPublication = yearOfPublication;
    }
    public String getBookTitle () {
        return this.bookTitle;
    }
    public String getAuthor () {
        return this.author;
    }

    public int getYearOfPublication () {
        return this.yearOfPublication;
    }
    public void setYearOfPublication (int yearOfPublication) {
        this.yearOfPublication = yearOfPublication;
    }
}