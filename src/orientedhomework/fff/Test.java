package orientedhomework.fff;

public class Test {
    public static void main(String[] args) {
        Person person = new Person();
        System.out.println(person.name);
//        System.out.println(person.age);private不能调
        System.out.println(person.sex);
        System.out.println(person.height);
        person.publicMethod();
        person.protectedMethod();
        person.defaultMethod();
//        person.privateMethod();privateMethod是私有的，不能调
    }
}
