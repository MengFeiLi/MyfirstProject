package jihehomework.day04;

public class User<indexof> {
    public String name;
    public String password;

    public User(String name, String password) {
        this.name = name;
        this.password = password;
    }

    @Override
    public int hashCode() {
        return this.name.hashCode() + this.password.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj == null)) {
            return false;
        }
        if (!(obj instanceof User)) {
            return false;
        }
        if (!(this.name.equals(((User) obj).name)
                && (this.password.equals(((User) obj).password)))) {
            return false;
        }
        return true;
    }
}