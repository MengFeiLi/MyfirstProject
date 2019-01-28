package orientedhomework.bbb;

public class B extends A {
    @Override
    public void display(){
        System.out.println("我是子类的普通方法");
        super.display();
    }
}
