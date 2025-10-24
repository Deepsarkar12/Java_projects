package Bookstore1;


import java.util.*;

public class BookStore {
    private static List<Book> books = new ArrayList<>();

    public BookStore23() {
        books.add(new Book(1, "978-0-192-63336-1", "The Great Gatsby", "F. Scott Fitzgerald"));
        books.add(new Book(2, "978-0-151-66034-6", "Nineteen Eighty-Four", "George Orwell"));
        books.add(new Book(3, "978-0-060-17322-7", "To Kill a Mockingbird", "Harper Lee"));
    }

    public int addBook(int id, String isbn, String title, String author) {
        // Check if book with same ID or ISBN already exists
        for (Book b : books) {
            if (b.getId() == id || b.getIsbn().equals(isbn)) {
                return 0; // Book not added
            }
        }
        books.add(new Book(id, isbn, title, author));
        return 1; // Book added successfully
    }

    public Book findBookById(int id) {
        for (Book b : books) {
            if (b.getId() == id)
                return b;
        }
        return null;
    }

    public Book findBookByName(String name) {
        for (Book b : books) {
            if (b.getTitle().equalsIgnoreCase(name))
                return b;
        }
        return null;
    }

    public List<Book> findAllBooks() {
        return books;
    }

    public int updateBookNameById(int id, String newName) {
        for (Book b : books) {
            if (b.getId() == id) {
                b.setTitle(newName);
                return 1;
            }
        }
        return 0;
    }

    public int bookCount() {
        return books.size();
    }

    public boolean deleteBookById(int id) {
        return books.removeIf(b -> b.getId() == id);

    }

    public void deleteAllBooks() {
        books.clear();
    }
}

