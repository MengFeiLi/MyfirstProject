package jihehomework.day05;

public class User {
    public String name;
    public String password;

    public User(String name,String password) {
        this.name = name;
        this.password = password;
    }
    public User(){

    }

    @Override
    public String toString() {
        return '['+"name="+name+"  "+"password="+password+']';
    }
}
