package jihehomework.day04;

import java.util.ArrayList;
import java.util.List;

public class Test{
    public static void main(String[] args) {
        List<User> list = new ArrayList<User>();

        User user1 = new User("张三","98k");

        User user2 = new User("李四","97k");


        if (user1.equals(user2)){
            System.out.println(true);
        }else {
            System.out.println(false);
        }
    }
}