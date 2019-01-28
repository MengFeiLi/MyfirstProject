package jihehomework.day03;


import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<User> list = new ArrayList<User>();
        User user1 = new User("1", "a");
        list.add(user1);
        User user2 = new User("2", "b");
        list.add(user2);
        User user3 = new User("3", "c");
        list.add(user3);
        User user4 = new User("4", "d");
        list.add(user4);
        User user5 = new User("5", "e");
        list.add(user5);
        User user6 = new User("3", "c");
        System.out.println(list.contains(user2));
        System.out.println(list.indexOf (user6));

    }
}
