package orientedhomework.ttt;

import day09.factory.Person;

public class Doctor extends Person {
    @Override
    public void sleep() {
        System.out.println("医生睡觉");
    }
}
