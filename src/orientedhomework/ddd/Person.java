package orientedhomework.ddd;

public class Person {
    private String name;
    private int age;
    public Person(String nameArg,int ageArg){
//        name=nameArg;
//        age=ageArg;
        this.name=nameArg;
        this.age=ageArg;
    }
    public String toString(){
        return "我是:"+name+"年龄:"+age;
    }
}
