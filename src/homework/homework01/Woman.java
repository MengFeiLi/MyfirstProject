package homework.homework01;

public class Woman {
    private String name;
    private boolean sex;
    private int age;

    public Woman(String n,boolean a,int b){
        name=n;
        sex=a;
        age=b;
    }
    public void speak(String work){
        System.out.println(name+"说: "+work);
    }

    public int getAge() {
        return age;

    }

}
