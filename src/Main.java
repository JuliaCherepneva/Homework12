//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Book firstBook = new Book("Чистый код: создание, анализ и рефакторинг",
                "Роберт", "Мартин", 2023);
        System.out.println(firstBook.getBookTitle() + ". " + firstBook.getFirstName() + " " + firstBook.getLastName()
                + ", " + firstBook.getYearOfPublication());
        Book secondBook = new Book("Java: руководство для начинающих",
                "Герберт", "Шилдт", 2023);
        secondBook.setYearOfPublication(2022);
        System.out.println(secondBook.getBookTitle() + ". " + secondBook.getFirstName() + " " + secondBook.getLastName()
                + ", " + secondBook.getYearOfPublication());

        Author firstAuthor = new Author("Ирвин", "Ялом");
        System.out.println(firstAuthor.getFirstName() + " " + firstAuthor.getLastName());
        Author secondAuthor = new Author("Зигмунд", "Фрейд");
        System.out.println(secondAuthor.getFirstName() + " " + secondAuthor.getLastName());
    }
}
