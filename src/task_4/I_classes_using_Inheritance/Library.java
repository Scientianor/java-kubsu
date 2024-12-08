package task_4.I_classes_using_Inheritance;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private final List<Book> books;

    public Library() {
        this.books = new ArrayList<>();
    }

    public void addBook(Book book) {
        if (book != null) {
            books.add(book);
        } else {
            throw new IllegalArgumentException("Книга не может быть null.");
        }
    }

    public void removeBook(Book book) {
        if (books.contains(book)) {
            books.remove(book);
        } else {
            throw new IllegalArgumentException("Книга не найдена в библиотеке.");
        }
    }

    public void printBooks() {
        if (books.isEmpty()) {
            System.out.println("Библиотека пуста.");
        } else {
            for (Book book : books) {
                System.out.println(book.getInfo());
            }
        }
    }

    public int countPrintedBooks() {
        int count = 0;
        for (Book book : books) {
            if (book instanceof PrintedBook) {
                count++;
            }
        }
        return count;
    }

    public int countEBooks() {
        int count = 0;
        for (Book book : books) {
            if (book instanceof EBook) {
                count++;
            }
        }
        return count;
    }

    public Book getBookAt(int index) {
        if (index >= 0 && index < books.size()) {
            return books.get(index);
        } else {
            throw new IndexOutOfBoundsException("Индекс вне диапазона.");
        }
    }

    public int getBooksCount() {
        return books.size();
    }
}
