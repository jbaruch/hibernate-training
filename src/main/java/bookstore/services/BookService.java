package bookstore.services;

import bookstore.model.Book;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created with IntelliJ IDEA.
 * User: Jeka
 * Date: 6/23/13
 * Time: 12:37 AM
 * To change this template use File | Settings | File Templates.
 */
public interface BookService {
    @Transactional(readOnly = true)
    void printBooksAbovePrice(int price);

    @Transactional(readOnly = true)
    void printAllBooks();

    @Transactional(noRollbackFor = RuntimeException.class,propagation = Propagation.REQUIRES_NEW)
    void addBook(Book book);

    Book findBook(Integer id);

    @Transactional(propagation = Propagation.NOT_SUPPORTED)
    void saveBook(Book book);
}
