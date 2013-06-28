import bookstore.services.BookService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created with IntelliJ IDEA.
 * User: Jeka
 * Date: 6/23/13
 * Time: 12:39 AM
 * To change this template use File | Settings | File Templates.
 */
public class Test {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("hibernate-context.xml");
        BookService service = context.getBean(BookService.class);

//        service.addBook(new Book(1,"Tanah",100));
        service.printBooksAbovePrice(10);
    }
}
