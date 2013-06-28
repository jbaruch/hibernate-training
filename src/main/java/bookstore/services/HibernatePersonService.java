package bookstore.services;

import bookstore.dao.PersonDao;
import bookstore.model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created with IntelliJ IDEA.
 * User: Jeka
 * Date: 6/28/13
 * Time: 11:44 PM
 * To change this template use File | Settings | File Templates.
 */
@Service
public class HibernatePersonService implements PersonService {
    @Autowired
    private PersonDao personDao;

    @Override
    @Transactional
    public void savePerson(Person person) {
        personDao.savePerson(person);

    }
}
