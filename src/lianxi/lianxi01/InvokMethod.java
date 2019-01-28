package lianxi.lianxi01;

public class InvokMethod {
//    InvokMethod(){
//
//    }

    public static void main(String[] var0) {
        DefineMethod.chengfa(2,7);

        int var1=DefineMethod.reduce(10,3);
        System.out.println("result1 = "+var1);

        DefineMethod var2 = new DefineMethod();



        int var3 = var2.add(5,3);
        System.out.println("result2 = "+var3);

        int var4 = var2.chuFa(15,3);
        System.out.println("result3 = "+var4);
    }
}
