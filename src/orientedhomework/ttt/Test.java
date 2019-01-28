package orientedhomework.ttt;

import day09.factory.Person;

public class Test {
    public static void main(String[] args) {
        Person person = CreatePersonFactory.CreatePersonFactory("student");
        person.sleep();
        Person person1 = CreatePersonFactory.CreatePersonFactory("driver");
        person1.sleep();
        Person person2 = CreatePersonFactory.CreatePersonFactory("doctor");
        person2.sleep();
    }
}
