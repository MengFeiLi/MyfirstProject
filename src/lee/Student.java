package lee;

public class Student {

    private String name;

    private int age;

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

    @Override
    public int hashCode() {
        System.out.println("---> hashCode");
        int hashCode = (name.hashCode() + age) * 10;
        return hashCode;
    }

    @Override
    public boolean equals(Object arg0) {
        System.out.println("---> equals");
        if(arg0 instanceof Student){//判断是否是学生对象
            Student stu = (Student) arg0;
            if(stu.getName().equals(this.name) && stu.getAge() == this.age){
                return true;
            }else{
                return false;
            }
        }else{
            return false;
        }
    }

    @Override
    public String toString() {
        String s = name + " : " + age;
        return s;
    }

}
