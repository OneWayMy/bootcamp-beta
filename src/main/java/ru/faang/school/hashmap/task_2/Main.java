package ru.faang.school.hashmap.task_2;


import ru.faang.school.hashmap.task_2.book.Book;

import java.util.HashMap;
import java.util.Map;

public class Main {
    private static Map<Book, String> books = new HashMap<>();

    public static void main(String[] args) {
        addBook("Mark", "Maks", 2023, "1");
        addBook("Lex", "Lexa", 2022, "2");

        deleteBook("Mark", "Maks", 2023);
        bookAll();
        deleteBook("Lex");
        System.out.println(searchBook("Mark", "Maks", 2023));
        System.out.println(searchBook("Lex", "Lexa", 2022));
        bookAll();
    }

    private static void addBook(String title, String author, int year, String shelfNumber) {
        books.put(new Book(title, author, year), shelfNumber);
    }

    private static void deleteBook(String title, String author, int year) {
        books.remove(new Book(title, author, year));
    }

    private static void deleteBook(String title) {
        books.entrySet().removeIf(bookStringEntry -> bookStringEntry.getKey().getTitle().equals(title));
    }

    private static String searchBook(String title, String author, int year) {
        Book book = new Book(title, author, year);
        if (books.containsKey(book)) {
            return books.get(book);
        }
        return "Такой книги нет !!";
    }

    private static void bookAll() {
        if (!books.isEmpty()) {
            books.forEach((key, value) -> System.out.println(key.toString() + " полка: " + value));
        } else {
            System.out.println("Книжная полка пуста !!!");
        }
    }
}
