package lianxi.lianxi03.zuoye;

/*
 * 表示旅行者的类
 */
public class Tourist {
    public String name;
    public String age;

    public Tourist(String nameArg, String ageArg) {
        name = nameArg;
        age = ageArg;
    }

    public String getName() {
        return name;
    }

    public void setName(String nameArg) {
        this.name = nameArg;
    }

    public void  setAge(String ageArg) {
        if (ageArg != null) {
            this.age = ageArg;
        }
    }

    public String getAge() {
        return age;
    }

    public void fly() {
        System.out.println("找旅行社预订旅游路线");
    }


}
