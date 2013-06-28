package bookstore.services;

import bookstore.model.Book;
import bookstore.model.Person;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author jbaruch
 * @since 29/06/13
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"/hibernate-context.xml"})
public class PersonServiceTest {
    @Autowired
    BookService bookService;
    @Autowired
    PersonService personService;

    @Test
    public void testSavePerson() throws Exception {

        Person baruch = new Person("Baruch");
        baruch.addBook(new Book("Spring", 60));
        baruch.addBook(new Book("Hibernate", 79));

        personService.savePerson(baruch);

        bookService.printBooksAbovePrice(10);

    }
}
