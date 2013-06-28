package mybookstore.services;

import mybookstore.dao.BookDao;
import mybookstore.model.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: Jeka
 * Date: 6/23/13
 * Time: 12:38 AM
 * To change this template use File | Settings | File Templates.
 */
@Service
public class HibernateBookService implements BookService {
    @Autowired
    private BookDao dao;

    @Transactional(readOnly = true)
    public void printBooksAbovePrice(int price) {
        List<Book> books = dao.getAllBooksAbovePrice(price);
        for (Book book : books) {
            System.out.println(book);
        }
    }

    @Transactional(readOnly = true)
    public void printAllBooks() {
        List<Book> books = dao.getAllBooks();
        for (Book book : books) {
            System.out.println(book);
        }
    }

    @Transactional(propagation = Propagation.NOT_SUPPORTED)
    public void saveBook(Book book) {
        addBook(book);
    }

    @Transactional(noRollbackFor = RuntimeException.class   )
    public void addBook(Book book) {
        dao.addBook(book);
    }

    public Book findBook(Integer id) {
        return dao.findBook(id);
    }
}
