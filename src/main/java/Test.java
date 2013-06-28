import mybookstore.model.Book;
import mybookstore.model.Person;
import mybookstore.services.BookService;
import mybookstore.services.PersonService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created with IntelliJ IDEA.
 * User: Jeka
 * Date: 6/23/13
 * Time: 12:39 AM
 * To change this template use File | Settings | File Templates.
 */
public class  Test {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("hibernate-context.xml");
        BookService bookService = context.getBean(BookService.class);
        PersonService personService = context.getBean(PersonService.class);

        Person baruch = new Person("Baruch");
        baruch.addBook(new Book("Spring",60));
        baruch.addBook(new Book("Hibernate",79));

        personService.savePerson(baruch);

        bookService.printBooksAbovePrice(10);
    }
}
