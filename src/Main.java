//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Author firstAuthor = new Author("Роберт Мартин");
        System.out.println(firstAuthor);
        Author secondAuthor = new Author("Герберт Шилдт");
        System.out.println(secondAuthor);

        System.out.println(firstAuthor.equals(secondAuthor));

        Book firstBook = new Book("Чистый код: создание, анализ и рефакторинг",firstAuthor, 2023);
        System.out.println(firstBook);
        Book secondBook = new Book("Java: руководство для начинающих", secondAuthor, 2023);
        secondBook.setYearOfPublication(2022);
        System.out.println(secondBook);

        System.out.println(firstBook.equals(secondBook));



    }


}
