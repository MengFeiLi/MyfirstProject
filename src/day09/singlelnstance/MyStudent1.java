package day09.singlelnstance;

public class MyStudent1 {

    private static MyStudent1 stu;
    private MyStudent1(){

    }

    public static MyStudent1 getin(){

        if (stu==null){
            stu=new MyStudent1();
        }
        return stu;
    }
}
