package orientedhomework.ttt;

import day09.factory.Person;

public class Student extends Person {
    @Override
    public void sleep() {
        System.out.println("学生睡觉");
    }
}
