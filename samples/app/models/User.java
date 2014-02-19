package models;

import com.play4jpa.jpa.models.Finder;
import com.play4jpa.jpa.models.Model;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * The User
 *
 * @author Jens (mail@jensjaeger.com)
 * @author rosem
 */
@Entity
public class User extends Model<User> {

    public static Finder<String, User> find = new Finder(String.class, User.class);

    @Id
    public String email;

    public String name;
}
