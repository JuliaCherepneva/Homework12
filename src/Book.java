public class Book {
    private String bookTitle;
    private String firstName;
    private String lastName;
    private int yearOfPublication;

    public Book (String bookTitle, String firstName, String lastName, int yearOfPublication) {
        this.bookTitle = bookTitle;
        this.firstName = firstName;
        this.lastName = lastName;
        this.yearOfPublication = yearOfPublication;
    }
    public String getBookTitle () {
        return this.bookTitle;
    }
    public String getFirstName () {
        return this.firstName;
    }
    public String getLastName () {
        return this.firstName;
    }
    public int getYearOfPublication () {
        return this.yearOfPublication;
    }
    public void setYearOfPublication (int yearOfPublication) {
        this.yearOfPublication = yearOfPublication;
    }
}