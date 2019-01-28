package lianxi.lianxi03.lianxi3;

public class Test {

    public static void main(String[] args) {
        Person p = null;
        //表示使用Person类。
        //这个时候Person的字节码文件就会被加载到jvm中，
        //jvm会自动的识别字节码文件中的静态代码块，并且执行
        p = new Person();
        System.out.println("p的国籍 ： " + p.country);//输出p的国籍
        Person p2 = new Person();//又要使用Person字节码
        System.out.println("p2的国籍 ： " + p2.country);//输出p2的国籍
    }

}
