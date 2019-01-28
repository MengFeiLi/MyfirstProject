package day09.singlelnstance;

public class MyStudent {
    private static MyStudent stu;
    private MyStudent(){

    }
    public static MyStudent getInstance(){
        if(stu==null){
            stu=new MyStudent();
        }
        return stu;
    }
}
