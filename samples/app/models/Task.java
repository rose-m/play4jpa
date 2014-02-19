package models;

import com.play4jpa.jpa.models.Finder;
import com.play4jpa.jpa.models.Model;
import play.db.jpa.JPA;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

/**
 * Model to handle tasks
 *
 * @author Jens (mail@jensjaeger.com)
 * @author rosem
 */
@Entity
public class Task extends Model<Task> {

    public static Finder<Long, Task> find = new Finder(Long.class, Task.class);

    @GeneratedValue
    @Id
    public Long id;

    //@Column(unique=true)
    public String name;

    public boolean done;

    @ManyToOne
    public User creator;

    /**
     * Sample method to demonstrate how to do find with Hql
     */
    public static Task findByNameWithHql(String name) {
        return JPA.em().createQuery("from models.Task where name = :name", Task.class)
                .setParameter("name", name)
                .getSingleResult();
    }
}
