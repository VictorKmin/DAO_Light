import java.util.Objects;

public class User {
   private String mName;
   private static int counter;
   private int mId;

    public User() {
        mId = ++counter;
    }

    public User(String mName) {
        this.mName = mName;
        this.mId = ++counter;
    }

    public String getmName() {
        return mName;
    }

    public void setmName(String mName) {
        this.mName = mName;
    }

    public int getmId() {
        return mId;
    }

    public void setmId(int mId) {
        this.mId = mId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof User)) return false;
        User user = (User) o;
        return getmId() == user.getmId() &&
                Objects.equals(getmName(), user.getmName());
    }

    @Override
    public int hashCode() {

        return Objects.hash(getmName(), getmId());
    }

    @Override
    public String toString() {
        return "User{" +
                "mName='" + mName + '\'' +
                ", mId=" + mId +
                '}';
    }
}
