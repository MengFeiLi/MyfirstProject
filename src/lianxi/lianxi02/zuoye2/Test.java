package lianxi.lianxi02.zuoye2;

public class Test {
    public static void main(String[] args) {

        Student student = new Student(12111, "李里", 22, 55, 55);
        student.displayInfo();
//        student.setLanguage(82);
//        student.displayInfo();
        System.out.println(student.toString());
//        student.displayInfo();



//
        Student student1 = new Student(12111, "李否", 35, 54, 45);
        student1.displayInfo();

        Student student2 = new Student(12111, "李是", 26, 85, 75);
        student2.displayInfo();

        double languages = ((student.getLanguage() + student1.getLanguage() + student2.getLanguage()) / 3);
        double languageAvg = languages;
        System.out.println("语文平均分:" + languageAvg);

        double numbers = ((student.getNumber() + student1.getNumber() + student2.getNumber()) / 3);
        double numberAvg = numbers;
        System.out.println("高数平均分:" + numberAvg);

        double printlns = ((student.getPhysical() + student1.getPhysical() + student2.getPhysical()) / 3);
        double printlnAvg = printlns;
        System.out.println("物理平均分:" + printlnAvg);

        System.out.println("总平均分:" + languageAvg + numberAvg + printlnAvg);
    }
}
