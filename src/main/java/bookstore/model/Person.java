package mybookstore.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: Jeka
 * Date: 6/23/13
 * Time: 1:06 AM
 * To change this template use File | Settings | File Templates.
 */
@Entity(name = "Persons")
public class Person {
    private long id;
    private String name;

    private List<Book> books = new ArrayList<Book>();

    public Person() {
    }

    public Person(String name) {
        this.name = name;
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    @OneToMany(mappedBy = "owner")
    @OrderColumn
    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    public long getId() {

        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}
