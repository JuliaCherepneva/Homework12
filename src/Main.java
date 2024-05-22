//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Book firstBook = new Book("Чистый код: создание, анализ и рефакторинг","Роберт Мартин",  2023);
        System.out.println(firstBook.getBookTitle() + ". " + firstBook.getAuthor() + ", " + firstBook.getYearOfPublication());
        Book secondBook = new Book("Java: руководство для начинающих", "Герберт Шилдт",  2023);
        secondBook.setYearOfPublication(2022);
        System.out.println(secondBook.getBookTitle() + ". " + secondBook.getAuthor() + ", " + secondBook.getYearOfPublication());

        Author firstAuthor = new Author("Роберт Мартин");
        System.out.println(firstAuthor.getName());
        Author secondAuthor = new Author("Герберт Шилдт");
        System.out.println(secondAuthor.getName());
    }
}
