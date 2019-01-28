public class Man extends Persion {
    private static Man ww;//全局变量

    public Man(String name, int age) {
        super(name, age);
    }


    public static void main(String[] args) {


        type(new Persion("1", 1));
        type(new Man("2", 1));


//        newnew();

        Man qq = new Man("d", 2);

        ww = new Man("a", 7);

//        qq.paly();
        System.out.println("吃鸡");
        qq.eat();

        qq.paly("平果手机");

        int x = 4;
        x = 6;
        System.out.println(x * 5 + 2);
        x = 5;
        x = 5;
        x = 5;


//        A a b c
//        B extends A :d+a b c
//        A aa=new B();
//        ((B)aa).d();
//        aa.a b c
//        aa.d


    }


    private static void type(Persion p) {
        if (p instanceof Man) {
            System.out.println("我是男的");
        } else if (p instanceof Persion) {
            System.out.println("我是人类");
        }

    }


    public void paly() {
        System.out.println("吃鸡");
    }

    public void paly(String phone) {

        System.out.println(phone + "打王者荣耀");
        System.out.println(phone + "ter");

    }


    public static void newnew() {
        Man qq = new Man("d", 2);

        ww = new Man("a", 7);

        qq.paly();
        qq.eat();

        qq.paly("平果手机");


    }

    String Sleep;

    public void Sleep(String Sleep) {
        System.out.println("我要");
        return;
    }
}
