package lianxi.lianxi02.zuoye1;

public class Student {
    private int studentId;
    private String name;
    private double language;
    private double number;
    private double physical;

    public Student(int studentId, String name, double language, double number, double physical) {
        this.studentId = studentId;
        this.name = name;
        this.language = language;
        this.number = number;
        this.physical = physical;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getLanguage() {
        return language;
    }

    public void setLanguage(double language) {
        this.language = language;
    }

    public double getNumber() {
        return number;
    }

    public void setNumber(double number) {
        this.number = number;
    }

    public double getPhysical() {
        return physical;
    }

    public void setPhysical(double physical) {
        this.physical = physical;
    }


}
