package mybookstore.dao;

import mybookstore.model.Person;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * Created with IntelliJ IDEA.
 * User: Jeka
 * Date: 6/28/13
 * Time: 11:43 PM
 * To change this template use File | Settings | File Templates.
 */
@Repository
public class HibernatePersonDao implements PersonDao {
    @PersistenceContext
    private EntityManager entityManager;
    @Override
    public void savePerson(Person person) {
        entityManager.persist(person);
    }
}
