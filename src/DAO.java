import java.util.Iterator;
import java.util.List;

public class DAO {

    Database database = new Database();


    public void save(User user) {
        database.getUserList().add(user);
    }

    public void delete(int id) {
        List<User> users = database.getUserList();
        Iterator<User> iterator = users.iterator();
        while (iterator.hasNext()) {
            User crntUsr = iterator.next();
            if (crntUsr.getmId() == id) {
                iterator.remove();
            }
        }
    }

    public User findOne(int id){
        User user = null;
        List<User> users = database.getUserList();
        Iterator<User> iterator = users.iterator();
        while (iterator.hasNext()) {
            User currntUsr = iterator.next();
            if (currntUsr.getmId() == id) {
                user = currntUsr;
            }
        }
        return user;
    }

    public List<User> findAll () {
        return this.database.getUserList();
    }
}
