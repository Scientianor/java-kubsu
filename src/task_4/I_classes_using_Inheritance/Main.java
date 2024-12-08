package task_4.I_classes_using_Inheritance;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();

        library.addBook(new PrintedBook("Война и мир", "Лев Толстой", 1225));
        library.addBook(new PrintedBook("Преступление и наказание", "Фёдор Достоевский", 671));
        library.addBook(new PrintedBook("Евгений Онегин", "Александр Пушкин", 384));
        library.addBook(new PrintedBook("Тихий Дон", "Михаил Шолохов", 1025));
        library.addBook(new EBook("Белая гвардия", "Михаил Булгаков", 2.4));
        library.addBook(new EBook("Обломов", "Иван Гончаров", 1.8));
        library.addBook(new PrintedBook("Гарри Поттер и философский камень", "Дж. К. Роулинг", 400));
        library.addBook(new PrintedBook("Властелин колец: Братство кольца", "Дж. Р. Р. Толкин", 500));
        library.addBook(new EBook("Цифровая крепость", "Дэн Браун", 1.2));
        library.addBook(new EBook("Стив Джобс", "Уолтер Айзексон", 2.1));

        System.out.println("Список книг в библиотеке:");
        library.printBooks();

        System.out.println("\nУдаляем случайные 3 книги:");
        removeRandomBooks(library, 3);


        System.out.println("\nСписок книг после удаления:");
        library.printBooks();
    }

    public static void removeRandomBooks(Library library, int count) {
        Random random = new Random();
        int totalBooks = library.getBooksCount();

        if (totalBooks < count) {
            throw new IllegalArgumentException("Невозможно удалить больше книг, чем есть в библиотеке.");
        }

        for (int i = 0; i < count; i++) {
            int randomIndex = random.nextInt(library.getBooksCount());
            Book bookToRemove = library.getBookAt(randomIndex);
            System.out.println("Удаляем: " + bookToRemove.getInfo());
            library.removeBook(bookToRemove);
        }
    }
}
