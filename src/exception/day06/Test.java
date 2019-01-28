package exception.day06;

import exception.day06.ZeroException;

public class Test {

    public static void main(String[] args) {
        int a = 10;
        int b = 0;
        if(b == 0){
            try {
                //用自己写的异常表示程序中出现的问题
                throw new ZeroException("除数不能为0");
            } catch (ZeroException e) {
                System.out.println(e.getMessage());
            }
        }else{
            System.out.println("a / b = " + (a / b));
        }
    }
}
