package lianxi.lianxi02;

public class InvokMethod {


    public static void main(String[] args) {

//       加法
        int c = DefineMethod.jiafa(22, 22);
        System.out.println("c = " + c);

//       减法

        int b = DefineMethod.jianfa(23, 24);
        System.out.println("b = " + b);

//       乘法
        DefineMethod.chengfa(22, 4);

//       除法

        DefineMethod defineMethod=new DefineMethod();

        int d=defineMethod.chufa(20,4);
        System.out.println(d);

    }
}
