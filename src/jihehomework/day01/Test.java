package jihehomework.day01;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<User> list = new ArrayList<User>();
        for (int i=0;i<10;i++){
            User user=new User("张三","98k");
            list.add(user);
        }
        for (int j=0;j<list.size();j++){
            User user=list.get(j);
            System.out.println("第" + j + "个用户是：" + user);
        }
    }
}
