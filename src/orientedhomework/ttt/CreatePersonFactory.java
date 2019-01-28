package orientedhomework.ttt;

import day09.factory.Person;

public class CreatePersonFactory {
    public static Person CreatePersonFactory(String flag){
        if ("doctor".equals(flag)) {
            Doctor doctor = new Doctor();
            return doctor;
        }else if("driver".equals(flag)){
            Driver driver = new Driver();
            return driver;
        }else if ("student".equals(flag)){
            Student student = new Student();
            return student;
        }
        return null;
    }
}
