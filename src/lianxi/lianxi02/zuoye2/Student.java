package lianxi.lianxi02.zuoye2;

public class Student {
    private int studentId;
    private String name;
    private double language;
    private double number;
    private double physical;

    public Student(){}

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

    public void displayInfo() {
        //82 dayin 其他不打印
//        if (language!=82){
//
//        }else {
//
//            System.out.println("学号:" + studentId + "\t" + "姓名:" + name + "\t" + "语文成绩:" + language + "\t" + "高数成绩:" + number + "\t" + "物理成绩:" + physical + "\t");
//        }
//        if (language!=82){
//            setLanguage(82);
            System.out.println("学号:" + studentId + "\t" + "姓名:" + name + "\t" + "语文成绩:" + language + "\t" + "高数成绩:" + number + "\t" + "物理成绩:" + physical + "\t");
//        }
    }




//    @Override
//    public  String toString() {
//        return super.toString();
//    }


    @Override
    public String toString() {
//        return "Student{" + "studentId=" + studentId + ", name='" + name + '\'' + ", language=" + language + ", number=" + number + ", physical=" + physical + '}';
//        return "888";
        return "学号:" + studentId + "\t" + "姓名:" + name + "\t" + "语文成绩:" + language + "\t" + "高数成绩:" + number + "\t" + "物理成绩:" + physical + "\t";
    }

}
