package homework.homework01;

public class Person {
    private String name;
    private boolean sex;
    private int age;

    public Person(String n,boolean b,int a){
        name = n;
        sex = b;
        age = a;
    }
    public void speak(String word){
        System.out.println(name+"说: " +word);
    }
    public void tread(){
        System.out.println("走走走");
    }
}
