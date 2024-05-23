//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Author firstAuthor = new Author("Роберт Мартин");
        System.out.println("Автор: " + firstAuthor);
        Author secondAuthor = new Author("Герберт Шилдт");
        System.out.println("Автор: " + secondAuthor);
        System.out.println("Результат сравнения авторов = " + firstAuthor.equals(secondAuthor));
        System.out.println("HashCode для переменной firstAuthor = " + firstAuthor.hashCode());
        System.out.println("HashCode для переменной secondAuthor = " + secondAuthor.hashCode());
        System.out.println();
        Book firstBook = new Book("Чистый код: создание, анализ и рефакторинг",firstAuthor, 2023);
        System.out.println("Книга: " + firstBook);
        Book secondBook = new Book("Java: руководство для начинающих", secondAuthor, 2023);
        secondBook.setYearOfPublication(2022);
        System.out.println("Книга: " + secondBook);
        System.out.println("Результат сравнения книг = " + firstBook.equals(secondBook));
        System.out.println("HashCode для переменной firstBook = " + firstBook.hashCode());
        System.out.println("HashCode для переменной secondBook = " + secondBook.hashCode());


    }


}
