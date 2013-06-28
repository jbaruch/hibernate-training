package mybookstore.dao;

import mybookstore.model.Book;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: Jeka
 * Date: 6/23/13
 * Time: 12:24 AM
 * To change this template use File | Settings | File Templates.
 */
public interface BookDao {
    List<Book> getAllBooksAbovePrice(int price);
    List<Book> getAllBooks();
    Book findBook(Integer id);

    void addBook(Book book);
}
