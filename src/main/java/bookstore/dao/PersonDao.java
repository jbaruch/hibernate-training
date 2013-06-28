package bookstore.dao;

import bookstore.model.Person;
import org.springframework.stereotype.Repository;

/**
 * Created with IntelliJ IDEA.
 * User: Jeka
 * Date: 6/28/13
 * Time: 11:42 PM
 * To change this template use File | Settings | File Templates.
 */
@Repository
public interface PersonDao {
    void savePerson(Person person);
}
