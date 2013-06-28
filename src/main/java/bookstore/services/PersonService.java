package bookstore.services;

import bookstore.model.Person;
import org.springframework.stereotype.Service;

/**
 * Created with IntelliJ IDEA.
 * User: Jeka
 * Date: 6/28/13
 * Time: 11:44 PM
 * To change this template use File | Settings | File Templates.
 */
@Service
public interface PersonService {
    void savePerson(Person person);
}
