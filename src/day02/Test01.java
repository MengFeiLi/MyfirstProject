package day02;


public class Test01 {



    public static void main(String[] args) {

        /*
         * 在java中 byte short int char
         * 都是通过int进行存储和计算
         */
        byte m = 66;

        byte b = 11;
        int a = 50;
        short e = 12;
        long f = 55l;

        int g = b + 10;

        byte n = (byte) a;
        //大--- 》 小
        m = (byte) (b + 10);
//		System.out.println(g);
        System.out.println(m);   //打印结束后换行
        System.out.print(m);    //打印结束后不换行

//		double c =3.2;
//		float d = 3.5f;
    }


}
