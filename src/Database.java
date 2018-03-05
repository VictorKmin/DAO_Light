import java.util.ArrayList;
import java.util.List;

public class Database {
    List<User> userList = new ArrayList<>();

    public Database() {
    }

    public Database(List<User> userList) {
        this.userList = userList;
    }

    public List<User> getUserList() {
        return userList;
    }

    public void setUserList(List<User> userList) {
        this.userList = userList;
    }

    @Override
    public String toString() {
        return "Database{" +
                "userList=" + userList +
                '}';
    }
}
