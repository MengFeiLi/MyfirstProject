package orientedhomework.fff;

public class Person {
    public String name="李";
    private int age=12;
    protected boolean sex=true;
    int height=177;//身高

    public void publicMethod() {
        System.out.println("我是public方法");
    }

    private void privateMethod() {
        System.out.println("我是private方法");
    }

    protected void protectedMethod() {
        System.out.println("我是protected方法");
    }

    void defaultMethod() {
        System.out.println("我是default方法");
    }
}
