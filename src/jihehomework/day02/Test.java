package jihehomework.day02;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<User> list = new ArrayList<User>();
        for (int i = 0; i < 10; i++) ;
        {
            User user = new User("李四", "98k");
            list.add(user);
        }
//        for(int i=0;i<list.size();i++){
//            User user=list.get(i);
//            System.out.println("第"+i+"个用户是"+user);
//        }

    }

}