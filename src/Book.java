import java.util.Objects;

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

    @Override
    public String toString() {
        return this.bookTitle + ". " + this.author + ", " + this.yearOfPublication;
    }
// Книги считаются одинаковыми, если совпадают автор и название, предположим, что год издания не имеет значения
    @Override
    public boolean equals(Object o) {
        if (getClass() != o.getClass()) {
            return false;
        }
        Book book = (Book) o;
        return bookTitle.equals(book.bookTitle) && author.equals(book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bookTitle, author, yearOfPublication);
    }
}