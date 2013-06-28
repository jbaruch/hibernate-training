package bookstore.dao;

import bookstore.model.Book;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: Jeka
 * Date: 6/23/13
 * Time: 12:35 AM
 * To change this template use File | Settings | File Templates.
 */
@Repository
public class HibernateBookDao implements BookDao {
    @PersistenceContext
    private EntityManager entityManager;

    public List<Book> getAllBooksAbovePrice(int price) {
        Query query = entityManager.createQuery("select b from bookstore.model.Book as b where b.price > :price");
//        Query query = entityManager.createNamedQuery("findBookMoreExpensiveThan");
        List<Book> resultList = query.setParameter("price", price).getResultList();
        return resultList;
    }

    public List<Book> getAllBooks() {
        Query query = entityManager.createQuery("from hibernate.Book ");
        List<Book> resultList = query.getResultList();
        return resultList;
    }

    public void addBook(Book book) {
        entityManager.persist(book);
    }

    public Book findBook(Integer id) {
        return entityManager.find(Book.class, id);
    }

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("hibernate-context.xml");
        BookDao bookDao = (BookDao) context.getBean("hibernateBookDao");
        bookDao.addBook(new Book(123, "Baron", 20));
    }
}
