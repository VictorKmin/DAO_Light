
public class Main {

    public static void main(String[] args) {

        DAO dao = new DAO();
    User ivan = new User("Ivan");
    User olga = new User("Olga");
    User vasya = new User("Vasuya");

        dao.save(ivan);
        dao.save(olga);
        dao.save(vasya);

        dao.delete(1);
        System.out.println(dao.findAll());

    }
}
