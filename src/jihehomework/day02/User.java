package jihehomework.day02;

public class User {
    public String name;
    public String password;

    public User(String name, String password) {
        this.name = name;
        this.password = password;
    }

    @Override
    public String toString() {
        String in = this.name + this.password;
        return in;
    }
}