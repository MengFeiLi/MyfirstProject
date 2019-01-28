package lianxi.lianxi02.zuoye;

public class Student {
    private String name;
    private int age;
    private boolean sex;
    private String classNum;
    private String sno;

    public Student(String name, int age, boolean sex, String classNum, String sno) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.classNum = classNum;
        this.sno = sno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isSex() {
            return sex;
    }

    public void setSex(boolean sex) {
        this.sex = sex;
    }

    public String getClassNum() {
        return classNum;
    }

    public void setClassNum(String classNum) {
        this.classNum = classNum;
    }

    public String getSno() {
        return sno;
    }

    public void setSno(String sno) {
        this.sno = sno;
    }

    public void displayInfo(){
        String setStr;
        if(sex){
            setStr ="🚹男";
            System.out.println("姓名："+name+"\t"+"年龄："+age+"\t"+"性别："+setStr+"\t"+"班级号："+classNum+"\t"+"座位号："+sno);
        }else {
             setStr="🚺女";
            System.out.println("姓名："+name+"\t"+"年龄："+age+"\t"+"性别："+setStr+"\t"+"班级号："+classNum+"\t"+"座位号："+sno);
        }
    }
}
