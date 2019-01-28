package orientedhomework.ppp;

import orientedhomework.ooo.A;
import orientedhomework.ooo.InterfaceA;

public class Test {
    public static void main(String[] args) {

        A a=new InterfaceA();
        ((InterfaceA) a).fun3();
    }
}
