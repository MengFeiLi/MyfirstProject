package lianxi.lianxi05;

import javax.swing.text.html.parser.Entity;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Test {
    public static void main(String[] args) {
        HashMap<String, MyHashMap> hashMap = new HashMap<String, MyHashMap>();
        MyHashMap stu1 = new MyHashMap("柬埔寨", 123);
        hashMap.put("name1", stu1);
        MyHashMap stu2 = new MyHashMap("卢旺达", 23);
        hashMap.put("name2", stu2);
        MyHashMap stu3 = new MyHashMap("乌克兰", 13);
        hashMap.put("name3", stu3);
        MyHashMap stu4 = new MyHashMap("哈尔滨", 12);
        hashMap.put("name4", stu4);
        MyHashMap stu5 = new MyHashMap("东三省", 213);
        hashMap.put("name5", stu5);
        Set<Map.Entry<String, MyHashMap>> set = hashMap.entrySet();
        for (Iterator<Map.Entry<String, MyHashMap>> it = set.iterator(); it.hasNext(); ) {
            Map.Entry<String, MyHashMap> qq = it.next();
            MyHashMap a = qq.getValue();
            System.out.println(a);
        }
    }
}
