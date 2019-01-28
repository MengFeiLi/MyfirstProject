package exception.day04;

public class Test {

    public static void main(String[] args) {

        int a = 10;
        int b = 0;
        int result = 0;
        if(b == 0){//表示程序肯定会报错
            //创建异常对象，表示程序在这种情况下会报错
            Exception e = new Exception("b不能为0");
            try {
                throw e;//抛出异常对象，告知会报错
            } catch (Exception e1) {
                System.out.println("错误信息：" + e1.getMessage());
            }
        }else{
            result = a / b;
        }
        System.out.println("result = " + result);
    }



}
