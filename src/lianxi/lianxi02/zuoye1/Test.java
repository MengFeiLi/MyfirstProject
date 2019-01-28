package lianxi.lianxi02.zuoye1;

public class Test {
    public static void main(String[] args) {
        Student student = new Student(12138, "王1", 88, 29, 44);
        Student student1 = new Student(12138, "王1", 88, 29, 44);
        Student student2 = new Student(12138, "王2", 88, 29, 44);
        Student student3 = new Student(12138, "王3", 88, 29, 44);
        Student student4 = new Student(12138, "王4", 88, 29, 44);
        Student student5 = new Student(12138, "王5", 88, 29, 44);
        Student student6 = new Student(12138, "王6", 88, 29, 44);
        Student student7 = new Student(12138, "王7", 88, 29, 44);
        Student student8 = new Student(12138, "王8", 88, 29, 44);
        Student student9 = new Student(12138, "王9", 88, 29, 44);
        Student student10 = new Student(12138, "王10", 88, 29, 44);

        double languages = ((student.getLanguage() + student1.getLanguage() + student2.getLanguage() +
                student3.getLanguage() + student4.getLanguage() + student5.getLanguage() +
                student6.getLanguage() + student7.getLanguage() + student8.getLanguage() +
                student9.getLanguage() + student10.getLanguage()) / 10);
        double languageAverage = languages;
        System.out.println("语文平均分:" + languageAverage);

        double numbers = ((student.getNumber() + student1.getNumber() + student2.getNumber() +
                student3.getNumber() + student4.getNumber() + student5.getNumber() +
                student6.getNumber() + student7.getNumber() + student8.getNumber() +
                student9.getNumber() + student10.getNumber()) / 10);
        double numberAverage = numbers;
        System.out.println("高数平均分:" + numberAverage);

        double physicals = ((student.getPhysical() + student1.getPhysical() + student2.getPhysical() +
                student3.getPhysical() + student4.getPhysical() + student5.getPhysical() +
                student6.getPhysical() + student7.getPhysical() + student8.getPhysical() +
                student9.getPhysical() + student10.getPhysical()) / 10);
        double physicalAverage = physicals;
        System.out.println("物理平均分:" + physicalAverage);



    }
}
